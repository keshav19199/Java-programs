package java_prog.StreamAPI.logics;

import java.util.List;

public class Rev_string {

	public static void main(String[] args) {

		String name="Keshav Popat Wadhavne";
		
		List.of(name.split(" "))
		.stream()
		.map((i)->(new StringBuffer(i)))
		.map((i)->(i.reverse()))
		.map((i)->(i.toString()))
		.forEach((i)->{System.out.println(i);});
	}

}
