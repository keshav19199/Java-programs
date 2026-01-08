package java_prog.StreamAPI;

import java.util.function.Consumer;

public class Consumer_3 {

	public static void main(String[] args) {

		Consumer<Double> c=(t)->{System.out.println(t*10);};
		c.accept((double) 23);
		
		Consumer<Integer>s=(g)->{ System.out.println(g+45);};
		
		s.accept(12);
	}

}
