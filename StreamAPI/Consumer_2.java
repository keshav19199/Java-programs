package java_prog.StreamAPI;

import java.util.function.Consumer;

public class Consumer_2 {

	public static void main(String[] args) {

		Consumer<Integer> demo=(i)->
		{
			System.out.println(i*5);
		};
		demo.accept(12);
	}

}
