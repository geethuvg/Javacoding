package p2;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import p1Wpr.Employee;

public class Employee15Main {

	public static void main(String[] args) {
		
		
		List<Employee15> empl = List.of
				(new Employee15(1001, "Alice", "HR", 50000,30),
		        new Employee15(1002, "Bob", "IT", 70000, 25),
		        new Employee15(1003,"Charlie", "HR", 60000,28),
		        new Employee15(1005,"David", "IT", 80000,31),
		        new Employee15(1004,"Eve", "Finance", 90000,34));
		
		//groupByDept(empl);//Group employees by department
		//groupByDeptsimple(empl);
		//findHighestSalary(empl);
		findSecondHighestSalary(empl);
	}
	private static void findSecondHighestSalary(List<Employee15> empl) {
		
		Employee15 emp = empl.stream()
				.distinct()
				.sorted(Comparator.comparing(Employee15::getSalary).reversed())
				.skip(1)
				.findFirst().orElseThrow();
		
		System.out.println("Second Highest Salary is  "+emp.getSalary());
		
	}

	private static void findHighestSalary(List<Employee15> empl) {
		
		List<Employee15> emplSorted = empl.stream()
					.sorted(Comparator.comparing(Employee15::getSalary).reversed())
					.collect(Collectors.toList());
		emplSorted.forEach(e-> System.out.println("name: "+e.getName() +" salary: "+ e.getSalary()));
	}

	private static void groupByDeptsimple(List<Employee15> empl) {
		Map<String, List<Employee15>> map =
				empl.stream()
			             .collect(Collectors.groupingBy(Employee15::getDepartment));
		
		map.forEach((dept,emp) -> System.out.println(dept +":" +emp));// will return object only not the emp name
	}

	private static void groupByDept(List<Employee15> empl) {
		
		Map<String, List<String>>result = empl.stream()
		.collect(
				Collectors.groupingBy(
						Employee15::getDepartment,
						Collectors.mapping(
								Employee15::getName, Collectors.toList())
						)
				);
		
		result.forEach((dept, names) -> System.out.println(dept +":" +names ));
		
	}
	
	


}
