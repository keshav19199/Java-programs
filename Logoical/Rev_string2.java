package java_prog.Logoical;

public class Rev_string2 {

	public static void main(String[] args) {

		String str="hii";
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println(rev);
	}

}
