package java_prog.StreamAPI_Revision;

import java.util.function.Supplier;

public class Supplier_1 {

	public static void main(String[] args) {
	
		Supplier<String> sup=()->(new String("abc"));
		
		System.out.println(sup.get());
	}

}
