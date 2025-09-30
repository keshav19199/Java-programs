package java_prog.loops;

public class SwitchCase {

	public static void main(String[] args) {

		String day="Monday";
		
		switch(day)
		{
		case"Sunday":
		{
			System.out.println("Today is Sunday..");
			break;
		}
		case"Monday":
		{
			System.out.println("Hurry.. Today is monday");
			break;
		}
		default:
		{
			System.out.println("I don't have that day..");
		}
		}
	}

}
