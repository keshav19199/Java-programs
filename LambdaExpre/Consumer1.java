package java_prog.LambdaExpre;

import java.util.function.Consumer;

public class Consumer1 {

	public static void main(String[] args) {

		Consumer<String> s=c->System.out.println(c);
		
		s.accept("Keshav");
	}

}
