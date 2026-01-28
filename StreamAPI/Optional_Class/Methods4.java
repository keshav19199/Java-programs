package java_prog.StreamAPI.Optional_Class;

import java.util.Optional;

public class Methods4 {

	public static void main(String[] args) {

		Optional<Integer> op=Optional.ofNullable(234);
		
		System.out.println(op.filter(i-> (i>200)));
		System.out.println(op.filter( i-> i>300));
		
		System.out.println(op.filter((i) -> {return i==234;}));
			
		System.out.println("*****************************");
		
		System.out.println(op.flatMap((i)->(Optional.of(i*2))).get());
		
	}

}
