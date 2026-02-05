package java_prog.practice;

public class Srt_1 {

	public static void main(String[] args) {

		String str=new String ("abc");
		String str2=new String ("abc");
		String str3="abc";
		String str4="abc";
		
		System.out.println(str==str2);
		System.out.println(str2==str3);
		System.out.println(str3==str4);
		
		System.out.println("*****  . equals   ****8");

		System.out.println(str.equals(str2));
		System.out.println(str2.equals(str4));
		System.out.println(str3.equals(str4));
		
		System.out.println("************8");
		
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());		
	}

}
