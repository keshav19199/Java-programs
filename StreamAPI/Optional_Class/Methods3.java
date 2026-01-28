package java_prog.StreamAPI.Optional_Class;

import java.util.Optional;

public class Methods3 {

	public static void main(String[] args) {

		Optional<String> op = Optional.ofNullable(null);
		Optional<String>op2=Optional.ofNullable("keshav");
		
		op.ifPresentOrElse(i -> System.out.println(i), () -> System.out.println("nhiiy value"));
		op2.ifPresentOrElse(System.out::println, () -> System.out.println("nhiy value"));	
		
		System.out.println(op.or(()-> Optional.of("no value...")));
		System.out.println(op.orElse("demo"));
	
		System.out.println(op.orElseGet(()->("not a valu present")));
		
	}

}
