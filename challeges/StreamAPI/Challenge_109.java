package java_prog.challeges.StreamAPI;

import java.util.List;

public class Challenge_109 {

	public static void main(String[] args) {


		List<Integer> list=List.of(1,2,3,4,5,6,7,8,9,10);
		
		list.stream()
		.filter(a->a%2==1)
		.forEach(a->System.out.println(a)	);
	}

}
