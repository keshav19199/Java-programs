package java_prog.practice;

public class RevCharat {

	public static void main(String[] args) {

		String str="Hello mam..";
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}

}
