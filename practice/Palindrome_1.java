package java_prog.practice;

public class Palindrome_1 {
	public static void main(String[] args) {
		
		int num=1332331;
		int temporry=num;
		int reverce=0;
		
		while(num !=0)
		{
			int digit=num%10;
			 reverce = reverce*10+digit;
			 
			 num=num/10;
		}
//		System.out.println(reverce);
//		System.out.println(num);
		
		if(temporry==reverce)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("noo");
		}
		
	}
}
