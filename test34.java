package challenge;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import p1Wpr.Employee;

// Employee with highest salary per department
public class test34 {

	public static void main(String[] args) {

		List<Employee> employeeList = List.of(new Employee("Shiv", "HR", 48000), new Employee("Durga", "HR", 51000),
				new Employee("Vishnu", "IT", 32000), new Employee("Laxmi", "IT", 39000),
				new Employee("Pushkar", "Account", 68000));

		Map<String, Employee> emp = employeeList.stream().collect(Collectors.groupingBy(e -> e.getDept(), Collectors
				.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get)));
		emp.entrySet().forEach(e -> System.out
				.println(e.getKey() + " " + e.getValue().getName() + " " + " " + e.getValue().getSalary()));
	}
}
