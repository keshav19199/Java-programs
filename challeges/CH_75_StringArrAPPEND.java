package java_prog.challeges;

public class CH_75_StringArrAPPEND {

	public static void main(String[] args) {

		String[] arr=new String[] {"Hi", "I", "am", "Keshav", "Wadhavane", "From", "Pune","."};
		
		StringBuilder sb=new StringBuilder();
		
		for(String str:arr)
		{
			sb.append(str).append(" ");
		}
		System.out.println(sb);
	}

}
