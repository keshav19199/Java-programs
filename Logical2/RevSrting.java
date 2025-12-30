package java_prog.Logical2;

public class RevSrting {

	public static void main(String[] args) {

		String str="QWERTY1234";
		String rev="";
		
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println(rev);
	}

}
