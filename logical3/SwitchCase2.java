package java_prog.logical3;

public class SwitchCase2 {

	public static void main(String[] args) {

		int day=6;
		
		String	dayStr=switch(day)
		{
			case 1 -> "monday";
			case 2-> "tuesday";
			case 3-> "wednesday";
			case 4-> "thurday";
			case 5-> "friday";
			//case 6-> "saturday";
			case 6,7-> "holiday";
			default -> "Invalid day";
		};
		System.out.println(dayStr);
		
		
	}

}
