package java_prog.LambdaExpre;

import java.util.List;
import java.util.function.Consumer;

public class Method_Reference {

	public static void main(String[] args) {

		Consumer<String> s=System.out::println;
		s.accept("Keshav");
		
		System.out.println("*********************************8");
		
		List<String> name=List.of("Karan","Hari","Rahul","Pritam");
		name.forEach(System.out::println);
	}

}
