package java_prog.StreamAPI.Optional_Class;

import java.util.Optional;

public class First {

	public static void main(String[] args) {

		Optional<String> op=Optional.empty();	// it is only for empty
		System.out.println(op);
		
		Optional<String> op2=Optional.ofNullable(null);	// it gives value or empty
		System.out.println(op2);
		//System.out.println(op2.get());  
		
		// it gives no such element exception.
		 
		Optional<String> op3=Optional.of(null);		// null pointer exception.
		System.out.println(op3);
		System.out.println(op3.get());	// .get return value only
		
		
		// many times used .ofnullable because it gives null or values.
		
	}

}
