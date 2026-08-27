package java_prog.StreamAPI_Revision;

import java.util.function.Supplier;

public class Supplier_2 {

	public static void main(String[] args) {

		Supplier<String> sup=()->("abc");
		
		System.out.println(sup.get());
	}

}
