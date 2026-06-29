package java_prog.challeges.CH_97_Enum2;

public class EnumTest2 {
	
	public static void main(String[] args) {
		
		System.out.println("Print all Days of Week\n");
		
		for(Day d: Day.values())
		{
			System.out.println(d+" " +d.getType());
		}
		
	}	
}
