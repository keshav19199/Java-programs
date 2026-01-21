package java_prog.string;

public class StringClass3 {

	public static void main(String[] args) {

		
		String str=new String("abc");	//o3
		String str2=new String("abc");	//o3
		String str3=("abc");		//o3
		String str4=("abc");		//o3
		
		System.out.println(str==str2);		//reference
		System.out.println(str3==str4);
		System.out.println(str.equals(str2));	//content
		System.out.println(str3.equals(str4));
		System.out.println(str.equals(str4));
	}

}
