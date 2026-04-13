package java_prog.logical3;

import java.util.Scanner;

public class DivByPreEleScanner {

	public static void main(String[] args) {
					
			Scanner sc=new Scanner(System.in);
				
			System.out.print("Enter no of elements:");
			
			int n=sc.nextInt();
			int arr[]=new int[n];
			
			System.out.print("Enter the elements: ");
			for(int i=0; i<n; i++)
			{
				arr[i]=sc.nextInt();
			}
			
			
			int count=0;
			
				for(int i=0; i<n; i++)
				{
					if(arr[i-1]!=0 && arr[i]%arr[i-1]==0)
					{
						count++;
					}
				}
			
				System.out.println("Total: "+count);
				sc.close();
			}

		

	}


