package java_prog.string;

public class StrEqual_hashc {

	public static void main(String[] args) {

		String str="abc";
		String str2="abc";
		String str3=new String("abc");
		String str4=new String ("abc");
		
		System.out.println(str.equals(str2));
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode()==str3.hashCode());
	}
	

}
