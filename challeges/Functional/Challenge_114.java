package java_prog.challeges.Functional;

import java.util.List;

public class Challenge_114 {

	public static void main(String[] args) {

		List<Employee> employee=List.of(
				
				new Employee("Keshav",120),
				new Employee("Rohan",150),
				new Employee("KArtik",130),
				new Employee("Anita",110),
				new Employee("Saurav",90));
		
		employee.stream()
		.sorted((e1,e2)->Integer.compare(e1.salary, e2.salary))
		.forEach(System.out::println);
		
		
	}
}
class Employee
{
	String name;
	int salary;
	
	public Employee(String name, int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	
	public String toString()
	{
		return name+": "+salary;
	}
}
