package p2;

class Employee15 {
    private int id;
    private String name;
    private String department;
    private double salary;
    private int age;

    public Employee15(int id, String name, String dept, int salary, int age) {
    	this.name = name;
        this.department = dept;
        this.salary = salary;
        this.id = id;
        this.age = age;
	}
	// getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }
}
