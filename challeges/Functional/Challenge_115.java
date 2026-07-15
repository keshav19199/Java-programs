package java_prog.challeges.Functional;

import java.util.List;

public class Challenge_115 {

	public static void main(String[] args) {

		List<String> list=List.of("1","3","2","4","5","6");
		
		list.stream()
		.map(i->Integer.parseInt(i))
		.map(i->Math.pow(i, 2))
		.forEach(System.out::println);
//		.reduce((a,b)->a+b)
//		.ifPresent(System.out::println);
	}

}
