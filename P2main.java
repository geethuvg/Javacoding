package p1Wpr;

import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;
// Categorize employees age wise
public class P2main {

	public static void main(String[] args) {
		List<Employee2> e = List.of(new Employee2(1, "emp1", 22), 
				new Employee2(2, "emp2", 28),
				new Employee2(3, "emp3", 45), 
				new Employee2(4, "emp4", 45));

		Map<Integer, List<String>> filtered = e.stream().filter(emp -> emp.age > 25) // close filter
				.collect(Collectors.groupingBy(Employee2::getAge, // this is only for grouping by age(first param of GB)
						Collectors.mapping((Employee2::getName), // mapping first param
								Collectors.toList())// map the name to a list
				));

		filtered.forEach((age, names) -> System.out.println(age + " : " + names));

	}

}
