package java_prog.StreamAPI.logics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Logic_3 {

	public static void main(String[] args) {

		String str="weelcoommees";
		char[] ch=str.toCharArray();
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
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
