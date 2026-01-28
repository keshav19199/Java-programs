package java_prog.StreamAPI.Optional_Class;

import java.util.Optional;

public class Methods {

	public static void main(String[] args) {

		Optional<String> op=Optional.ofNullable("keshav");
		
		System.out.println(op.isEmpty());
		System.out.println(op.isPresent());
		System.out.println(op.get());
		System.out.println(op);
	}

}
