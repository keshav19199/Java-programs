package java_prog.Logoical;

public class RevString {

	public static void main(String[] args) {

		String str="kkeshhaav";
		String rev="";
		
		for (int i = str.length()-1; i>=0; i--)
		{
			rev += str.charAt(i);
		}
		System.out.println("Reverce the String: "+rev);
		
		
	}

}
