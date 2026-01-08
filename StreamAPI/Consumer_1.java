package java_prog.StreamAPI;

import java.util.function.Consumer;

public class Consumer_1 {

	public static void main(String[] args) {

		Cons_demo con=new Cons_demo();
		con.accept(5);
	}
}
class Cons_demo implements Consumer<Integer>
{
	public void accept(Integer t)
	{
		System.out.println(t*3);
	}
}