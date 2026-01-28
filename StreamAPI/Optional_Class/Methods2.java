package java_prog.StreamAPI.Optional_Class;

import java.util.Optional;

public class Methods2 {

	public static void main(String[] args) {

		Optional<String> op=Optional.ofNullable("Keshav");
		
		System.out.println(op);
		op.ifPresent(i -> System.out.println(i.toUpperCase()));
		
		op.ifPresentOrElse(i -> System.out.println(i), () -> System.out.println("nhiy value"));	
		
	}

}
