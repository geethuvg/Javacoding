package p1Wpr;

import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class P1main {

	public static void main(String[] args) {
		List<Employee> e = List.of(
		        new Employee("Alice", "HR", 50000),
		        new Employee("Bob", "IT", 70000),
		        new Employee("Charlie", "HR", 60000),
		        new Employee("David", "IT", 80000),
		        new Employee("Eve", "Finance", 90000));
		       
		     
		        
		        Map<String, Double> deptWise = e.stream()
		        	    .collect(Collectors.groupingBy(
		        	        emp -> emp.dept,
		        	        Collectors.summingDouble(emp -> emp.salary)
		        	    ));
					
		        deptWise.forEach((dept, total)->
					System.out.println("dept " +dept+" --> total salary  " +total));

	}

}
