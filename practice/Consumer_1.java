package java_prog.practice;

import java.util.function.Consumer;

public class Consumer_1 {

	public static void main(String[] args) {

		Consumer<Integer> con=(i) -> {System.out.println(i*3);};
		
		con.accept(5);
	}

}
