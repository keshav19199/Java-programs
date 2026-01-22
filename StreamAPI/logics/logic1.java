package java_prog.StreamAPI.logics;

import java.util.Arrays;
import java.util.List;

public class logic1 {

	public static void main(String[] args) {
	
		List<String> list1=Arrays.asList("asd","qwe","rew");
		List<String> list2=Arrays.asList("qwe","rew");
		List<String> list3=Arrays.asList("asewd","fdrew");
		List<String> list4=Arrays.asList("asdrew");
		
		List<List<String>> list5=Arrays.asList(list1,list2,list3);
		List<List<List<String>>> list6=Arrays.asList(list5);
		List<List<List<List<String>>>> list7=Arrays.asList(list6);
		
		System.out.println(list7);
		
	int sum=list7.stream()
				.flatMap((i) ->{return i.stream();})
				.flatMap(i -> i.stream())
				.flatMap(i -> i.stream())
				//.peek((i)-> {System.out.println(i);})
				.map((i) -> {return i.length();})
				.reduce(0,(i,j)->(i+j));
		   
       	System.out.println(sum);
	}

}
