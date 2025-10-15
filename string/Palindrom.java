package java_prog.string;

public class Palindrom {

	public static void main(String[] args) {
		//print the palindrom madam.
		
		String str="keshav vahsek";
		boolean isPalindrom=true;
		
		int start=0;
		int end=str.length()-1;
		
		while(start < end)
		{
			System.out.println(start+ "--" +end);
			if(str.charAt(start) != str.charAt(end))
			{
				isPalindrom=false;
				
			}
			start++;
			end--;
		}
		if(isPalindrom)
		{
			System.out.println(str+" is a Palindrom");
		}
		else
		{
			System.out.println(str+" is not a Palindrom..");
		}
		
	}

}
