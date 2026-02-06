package java_prog.practice;

public class Rev_2 {

	public static void main(String[] args) {

		String str="987654321";
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);
	}

}
