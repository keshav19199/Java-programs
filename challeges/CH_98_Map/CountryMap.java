package java_prog.challeges.CH_98_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {

	public static void main(String[] args) {

		Map<String, String> map=new HashMap<String, String>();
		
		map.put("India","Pune");
		map.put("China","Beging");
		map.put("UK","New Tork");
		map.put("Brazil","Sutha the aurto");
		map.put("USA","Landon");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Country Name: ");
		String country=sc.next();
		
		if(map.containsKey(country))
		{
			System.out.println(country+" "+map.get(country));
		}
		else {
			
			System.out.println("Ohh, it's Don't know Country..");
		}
	}

}
