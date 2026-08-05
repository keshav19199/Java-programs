package java_prog.Map_revision;

import java.util.LinkedHashMap;

public class Frequency_Checked {

	public static void main(String[] args) {

		LinkedHashMap<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		
		String str="bannaanay";
		
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}

}
