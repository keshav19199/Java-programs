package java_prog.challeges.CH_79_Employee;

class Employee {
	private String name;
	private int age;
	private double salary;
	
	public Employee(int age, String name, double salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
	String getEmployeeDetails()
	{
		return "Name: "+name+", Age: "+age+", salary"+salary;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}



	public static void main(String[] args) {

		
	}

}
