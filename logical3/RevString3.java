package java_prog.logical3;

public class RevString3 {

	public static void main(String[] args) {

		String s="Queen";
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
