package java_prog.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Function_3 {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("hello");
		list.add("Hiii...");
		list.add("keshava madhava");
		
		// reverce the string with string API
		//  to lower case
		
		Function<String, String> fun2= (s)->{return s.toUpperCase();};
		
		Function<String, StringBuffer> fun1=(s)->{return new StringBuffer(s).reverse();};
		Consumer<StringBuffer> co=(i)->{System.out.println(i);};
		
		System.out.println(list);
		list.stream().map(fun2).map(fun1).forEach(co);;
		
		
	}
	
}
