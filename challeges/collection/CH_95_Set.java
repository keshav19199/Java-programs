package java_prog.challeges.collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CH_95_Set {

	public static void main(String[] args) {

		Set<Character> set=new HashSet<Character>();
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your String: ");
		String str=sc.next();
		
		for(char c: str.toCharArray())
		{
			set.add(c);
		}		
		System.out.println("Unique Char: "+set);
		System.out.println("Size: "+set.size());
		
		
		
	}

}
