package java_prog.challeges.StreamAPI;

import java.util.List;

public class Challenge_107 {

	public static void main(String[] args) {

		List<String> name=List.of("Keshav","Karan","Kartik","Pratik");
		
		name.stream().forEach(n->System.out.println(n));
	}

}
