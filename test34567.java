package challenge;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import p1Wpr.Employee;
// Department wise employee grouping: Department - name
public class test34567 {

	public static void main(String[] args) {
		
	List<Employee> a = 	List.of(new Employee("Arun", "IT", 50000),
				new Employee("Binu", "IT", 59000),
				new Employee("Chirag", "HR", 65000));
	Map <String ,List<String>> map1 = a.stream()
			.collect(Collectors.groupingBy(Employee::getDept,Collectors.mapping(Employee::getName, Collectors.toList())));
	System.out.println(map1);

	}

}
