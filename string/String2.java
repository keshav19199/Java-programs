package java_prog.string;

public class String2 {

	public static void main(String[] args) {

		//array
		Employee arr[]= {
				new Employee(1, 9893.9),
				new Employee(2,7649.38),
				new Employee(3,6749.03),
				new Employee(4,6739.89)};
		
		
		System.out.println(arr[3].id);
		System.out.println(arr[3].salary);  //it's a direct access to salary. 
	}

}
class Employee
{
	int id;
	double salary;
	
	public Employee(int id, double salary)
	{
		this.id=id;
		this.salary=salary;
	}
}
