package java_prog.logical3;

public class StringRev {

	public static void main(String[] args) {

		String str="i love india";
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
	}

}
