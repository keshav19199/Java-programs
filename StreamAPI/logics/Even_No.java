package java_prog.StreamAPI.logics;

import java.util.List;

public class Even_No {

	public static void main(String[] args) {

		List.of(12,13,15,17,6,43,54,65,87)
		.stream()
		.filter((i)->(i%2==0))
		.forEach((i)->{System.out.println(i);});
	}

}
