package java_prog.stream_Operations;

import java.util.List;
import java.util.function.Predicate;

public class List2 {

	public static void main(String[] args) {

		List<Integer> list=List.of(24,3,4,5,6,42,13);
		
		Predicate<Integer> pre=(p)->{return p>10;};
		
		list.stream().forEach((i)->{System.out.println(i*2+" hi..");});
		System.out.println("*************");
		
		System.out.println("Using Filter Operation: ");
		list.stream().filter(pre).forEach((i)->{System.out.println(i);});
	}

}
