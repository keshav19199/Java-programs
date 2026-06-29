package java_prog.challeges.collection;

public class CH_89_Concatenate {

	public static String concatenate(String... str)
	{
		StringBuilder sb=new StringBuilder();
		for(String s:str)
		{
			sb.append(s).append(" ");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {

		System.out.println(concatenate("Keshav","Wadhavane"));
		System.out.println(concatenate("Hello","Prashant","Raut"));
		System.out.println(concatenate("Yes","It's","My Friends"));
	}

}
