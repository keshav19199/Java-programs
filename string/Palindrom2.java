package java_prog.string;

public class Palindrom2 {

	public static void main(String[] args) {

		String str="abcddcba";
		boolean isPalindrom=true;
		
		int start=0;
		int end=str.length()-1;
		
		while(start < end)
		{
			if(str.charAt(end) != str.charAt(end))
			{
				isPalindrom=false;
			}
			start++;
			end--;			
		}
		if(isPalindrom)
		{
			System.out.println(str+" is palindrom");
		}
		else
		{
			System.out.println(str+" is not palindrom");
		}
	}

}
