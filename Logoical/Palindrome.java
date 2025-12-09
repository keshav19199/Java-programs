package java_prog.Logoical;

public class Palindrome {

	public static void main(String[] args) {

		int num=11211;
		int temp=num;
		int rev=0;
		
		while(num != 0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
					
		}
		if(temp==rev)
		{
			System.out.println(temp+" :is palindrome");
		}
		else
		{
			System.out.println(temp+" : is notpalindrome");
		}
	}

}
