package java_prog.challeges;

import java.util.Scanner;

public class CH_74_GussingGame {


		int random;
		CH_74_GussingGame()
		{
			random=(int) Math.ceil(Math.random()*100);
		}
		
		int guss(int gussNumber)
		{
			return gussNumber - random;
		}
		
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			CH_74_GussingGame game=new CH_74_GussingGame();
			
			System.out.println("Welcome to ur Gussing game..");
			
			int guss;
			int result;
			
			do
			{
				System.out.print("Guss The No between 1 to 100: ");
				guss=sc.nextInt();
				
				result=game.guss(guss);
				
				if(result==0)
				{
					System.out.println("Congrats Your guess is correct");
				}
				else if(result<0)
				{
					System.out.println("Please guess Higher");
				}
				else
				{
					System.out.println("Please Guess Lower");
				}
				
			}
			while(result!=0);
	}

}
