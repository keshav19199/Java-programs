package java_prog.StreamAPI_Revision;

public class First {

	public static void main(String[] args) {

		I_add i=(t)->(t.length());
		
		System.out.println(i.add("hello"));
		
	}

}
@FunctionalInterface
interface I_add
{
	int add(String s);
}
