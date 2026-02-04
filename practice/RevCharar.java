package java_prog.practice;

public class RevCharar {

	public static void main(String[] args) {

		String num="123456";
		String rev="";
		
		for(int i=num.length()-1; i>=0; i--)
		{
			rev=rev+num.charAt(i);
		}
		
		System.out.println(rev);
	}

}
