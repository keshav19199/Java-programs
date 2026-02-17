package java_prog.multiThreading.Execu;

import java.util.concurrent.Callable;

public class Execoter_1 {

	public static void main(String[] args) throws Exception {

		Callable<Integer> c=()->{return 28;};
		
		System.out.println(c.call());
		
	}

}
