package java_prog.challeges.Employee_CH_79;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e=new Employee(22,"Keshav",78.87);
		System.out.println(e.getEmployeeDetails());
		e.setAge(23);
		e.setName("Satish");
		
		System.out.println(e.getEmployeeDetails());
	}

}
