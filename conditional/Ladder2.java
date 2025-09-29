/* Write a java Program to Following This Conditions.
 * amount 	<100000 Low worth income.
 * amount >=100000 Medium worth income.
 * amount >=500000 High worth income.
 * amount >=1000000 Ultra High worth income.
 * amount 50000 Hard Work and Gain or save money
 */
package java_prog.conditional;

public class Ladder2 {
	public static void main(String[] args) {
	
		double amount=119054.000;
	
		if(amount>=50000 && amount<100000)
		{
			System.out.println("Low worth income");
		}
		else if(amount>=100000 && amount<500000)
		{
			System.out.println("Medium worth income");
		}
		else if(amount>=500000 && amount<1000000)
		{
			System.out.println("High worth income");
		}
		else if(amount>=1000000)
		{
			System.out.println("Ultra High worth income");
		}
		else
		{
			System.out.println("Work Hard and Gain or save money");
		}

	}
}