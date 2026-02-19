package p1Wpr;

import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;
public class Employee {
    String name, dept;
    double salary;
    public Employee(String name, String dept, double salary){
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        
        
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
    
}