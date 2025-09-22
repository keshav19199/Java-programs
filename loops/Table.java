// Write a code of any number of Table..

package java_prog.loops;

public class Table {
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) 
		{
			System.out.println("*************************************");
			for(int multi=1; multi<=10; multi++) 
			{
				
				System.out.print(i*multi+"  ");
			}
			System.out.println();
		}		
	
	}
}