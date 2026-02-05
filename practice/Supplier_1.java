package java_prog.practice;

import java.util.function.Supplier;

public class Supplier_1 {

	public static void main(String[] args) {

		Supplier<Integer> sup=()-> 34*2;
		
		System.out.println(sup.get());
	}

}
