package java_prog.Map_revision;

import java.util.LinkedHashMap;

public class LinkedHash_MAp {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> map=new LinkedHashMap<Integer, String>();
		
		map.put(1, null);
		map.put(2, "kartik");
		map.put(3, "rohan");
		map.put(2, "sohan");
		
		System.out.println(map);
	}

}
