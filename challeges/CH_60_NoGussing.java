package java_prog.challeges;

import java.util.Scanner;

public class CH_60_NoGussing {

	public static void main(String[] args) {

		System.out.println("Welcome to Guessing numuber");
		
		Scanner sc=new Scanner(System.in);
		int num=4, guess;
		
		do {
			System.out.println("Guess the no between 0 to 9: ");
			guess=sc.nextInt();
		}
		while(num != guess);	// loop is false then stop here and print the next
								// block of code because ; is used in while  
		{
			System.out.println("you have successfully guessing the number..!");
		}	// ataa ith ek condition ahe mhnun {} nhi del tri chalt
		System.out.println("Helooo");
				
	}

}
