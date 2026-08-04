package java_prog.Map_revision;

import java.util.HashMap;
import java.util.Map;

public class Map_1 {

	public static void main(String[] args) {

		String s="abc";
		String s2=new String("abc");
		
		
		System.out.println(s.hashCode()+" "+s2.hashCode());
		System.out.println(s.equals(s2));
		System.out.println(s==s2);
		
		System.out.println("*************************");
		
		Map<String, String> map=new HashMap<String, String>();
		
		map.put(s, "Hello Pune");
		map.put(s2, "Karve NAgar");
		
		System.out.println(map);
		System.out.println(map.size());
		
	}

}
