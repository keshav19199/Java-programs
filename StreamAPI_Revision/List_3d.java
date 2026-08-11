package java_prog.StreamAPI_Revision;

import java.util.List;

public class List_3d {

	public static void main(String[] args) {

		List<List<String>> list1=List.of(List.of("ijk","lmn"));
		List<List<String>> list2=List.of(List.of("lmn","opq"));
		
		List<List<List<String>>> list3=List.of(list1,list2);
		
		System.out.println(list3);
		
int sum=list3.stream()
		.flatMap((i)->(i.stream()))
		.flatMap((i)->(i.stream()))
		.map((i)->(i.length()))
		.reduce(0,(i,j)->(i+j));
		

	System.out.println(sum);
	
	}

}
