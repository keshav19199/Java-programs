package java_prog.Method_Reference;

import java.util.List;

public class Static_Method_Ref {
	public static void main(String[] args) {
		
		List.of(12,13,14,15,17,16,19)
		.stream()
		//.filter((i)->(i%2==0))
		.filter(Demo::check)
		.forEach((i)->{System.out.println(i);});
	}
}
class Demo
{
	public static boolean check(int i)
	{
		return i%2==0;
	}
}
