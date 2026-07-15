package java_prog.challeges.StreamAPI;

import java.util.List;

public class Challenge_108 {

	public static void main(String[] args) {

		List<String> str=List.of("Keshav is Good Boy ","Unsuccess" ," And He Is LEarning Java ","One Day He Always Success ",
				"Because He Revise All tOpuics Clearly"," Bad Boy");
		
		
String result =str.stream()
		.filter(a->a.length()>10)
		.reduce("",(b,c)-> b+c);
		
System.out.println(result);
		
	}

}
