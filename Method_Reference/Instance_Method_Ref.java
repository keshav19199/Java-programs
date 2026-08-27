package java_prog.Method_Reference;

import java.util.List;

public class Instance_Method_Ref {

	public static void main(String[] args) {

		Demor d=new Demor();
		
		List.of(11,12,13,14,56,43,33)
		.stream()
		.filter(d::check)
		.forEach((i)->{System.out.println(i);});
	}
}
class Demor
{
	public boolean check(int i)
	{
		return i%2==0;
	}
}
