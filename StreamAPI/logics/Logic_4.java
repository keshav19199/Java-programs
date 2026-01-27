package java_prog.StreamAPI.logics;

import java.util.List;
import java.util.stream.Collectors;

public class Logic_4 {

	public static void main(String[] args) {

	
		String str="weelccoome";
	
	//	StringBuffer sb= new StringBuffer();
			
	String result=	str.chars()
		.mapToObj(c->(char)c)
		.distinct()
		.map(String::valueOf)
		.collect(Collectors.joining());
		
	System.out.println(result);
		
	}

}
