package java_prog.string;

public class String3 {

	public static void main(String[] args) {

		Employee1 arr[]= {
				new Employee1(1,3224.43),
				new Employee1(2,3424.32),
				new Employee1(3,6433.75),
				new Employee1(4,3432.43892)};
		
		//System.out.println(arr[2].id);
		//System.out.println(arr[2].salary);	// it's a direct access, it's ok but not a good direction.
		
		System.out.println(arr[2].getid());		// it's a perfect way to access
		System.out.println(arr[2].getsalary());
	}

}
class Employee1
{
	int id;
	double salary;
	
	public Employee1(int id, double salary)
	{
		this.id=id;
		this.salary=salary;
	}
	
	
	public double getsalary()	//private access
	{
		return this.salary;
	}
	public int getid()
	{
		return this.id;
	}
}
