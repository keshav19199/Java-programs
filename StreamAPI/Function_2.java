package java_prog.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Function_2 {

	public static void main(String[] args) {

		List<String> l=new ArrayList<String>();
		l.add("Hello");
		l.add("hiii...");
		l.add("Keshav");
		l.add("My name is keshav popat wadhavane");
		
		System.out.println(l);
		
		
		Function<String, Integer> fun=(s)->{return s.length();};
		Consumer<Integer> con=(i)->{System.out.println(i);};
		
		l.stream().map(fun).forEach(con);	// calculate the length
		
		
	}

}
