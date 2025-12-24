package java_prog.collection.Map;

import java.util.HashMap;
import java.util.Map;

public class Logical {

	public static void main(String[] args) {

		String str="qwertrsssssssssewertgvcdf";
		
		char[] ch=str.toCharArray();
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		
		for(char c:ch)
		{
			int frequency=1;
			if(map.containsKey(c))
			{
				frequency=map.get(c)+1;
			}
			map.put(c, frequency);
		}
		System.out.println(map);
	}

}
