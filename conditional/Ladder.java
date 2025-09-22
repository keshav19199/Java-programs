/*Write a java Program to following this conditions.
		marks >=0  to <35 =>fail
		marks >=35 to 45 =>Third Division
		marks >=46 to 60 =>Second Division
		marks >=61 to 75 =>First Division
		marks >=76 to 100=>Distinction
		Otherwise invalid marks
*/

package java_prog.conditional;

public class Ladder {
	public static void main(String[] args) {
		
		double marks=71.33;
		
		if(marks>=0 && marks<35)
		{
			System.out.println("Student are fail, Better luck next Time..");
		}
		else if(marks>=35 && marks<=45)
		{
			System.out.println("Passed and Third Division..");
		}
		else if(marks>45 && marks<=60)
		{
			System.out.println("Passed and Third Divisio..");
		}
		else if(marks>60 && marks<=75)
		{
			System.out.println("Passed and First Division..");
		}
		else if(marks>75 && marks<=100)
		{
			System.out.println("Congratulation!!! You are Passed and Distinction..");
		}
		else
		{
			System.out.println("Your marks are invalid.. Please Type valid marks");
		}
		
	}

}
