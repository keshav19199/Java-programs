package java_prog.Logoical;

public class RevString2 {

	public static void main(String[] args) {

		String str="hellooo";
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}

}
