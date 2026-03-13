package java_prog.StreamAPI.logics;

import java.util.HashMap;
import java.util.Map;

public class Frequency_1 {

	public static void main(String[] args) {

		String str="weellcomeee";
		char[] arr=str.toCharArray();
		
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(char a:arr)
		{
			int freq=1;
			if(map.containsKey(map))
			{
				freq=map.get(a)+1;
			}
			map.put(a, freq);
		}
		System.out.println(map);
	}

}
