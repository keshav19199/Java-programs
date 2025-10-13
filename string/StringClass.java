package java_prog.string;

public class StringClass {

	public static void main(String[] args) {

		Demo s =new Demo();
		s.demo();
		
	}

}
class Demo
{
	public void demo()
	{
		String str=new String("abc");	//o1
		String str2=new String("abc");	//o2
		String str3="abc";		//o3
		String str4="abc";		//03	share the value at line 19
		
		System.out.println(str==str2);	
		System.out.println(str3==str4);
	}
}
