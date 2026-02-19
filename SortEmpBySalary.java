package p2;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortEmpBySalary {

	public static void main(String[] args) {
		
		List<Employee15> empList = List.of(
				new Employee15(1001, "A", "HR", 750000,38),
				new Employee15(1001, "B", "IT", 650000,39),
				new Employee15(1001, "C", "HR", 40000,30),
				new Employee15(1001, "D", "IS", 90000,33),
				new Employee15(1001, "E", "FIN", 110000,20),
				new Employee15(1001, "F", "IS", 50000,40)
				);
		
		Stream<Employee15> l =empList.stream()
				.sorted(Comparator.comparing(Employee15::getSalary).reversed());
		l.forEach(e-> System.out.println("name : " + "Dept : "+ e.getDepartment() + e.getName()+ " salary : " +e.getSalary()));
		
		Map<String, List<String>> deptwise = empList.stream()
														.collect(Collectors.groupingBy(Employee15::getDepartment,
																Collectors.mapping(Employee15::getName, Collectors.toList())));
				
        deptwise.forEach((e, names) -> System.out.println(e+" : "+ names));
	}

}
