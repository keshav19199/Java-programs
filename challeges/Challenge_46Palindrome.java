package java_prog.challeges;

public class Challenge_46Palindrome {

	public static void main(String[] args) {

		int num[]= {1,2,3,4,3,2,1};
		boolean isPalin=true;
		
		int i=0;
		while(i<num.length)
		{
			if(num[i] != num[num.length-1-i])
			{
				isPalin=false;
				break;
			}
			i++;
		}
		if(isPalin)
		{
			System.out.println("Palindrome");
		}
		else {
		System.out.println("not palindrome");
		}
	}

}
