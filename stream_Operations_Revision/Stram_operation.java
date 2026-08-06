package java_prog.stream_Operations_Revision;

import java.util.ArrayList;

public class Stram_operation {

	public static void main(String[] args) {

		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		arr.add(12);
		arr.add(13);
		arr.add(14);
		arr.add(15);
		arr.add(16);
		arr.add(17);
		
		System.out.println(arr);
		
		arr.stream().filter((s)->(s%2==0))
		.forEach((s)->{System.out.println(s);});
	}

}
