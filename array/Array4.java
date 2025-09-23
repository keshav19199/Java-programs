package java_prog.array;

public class Array4 {
	public static void main() {
		
		String[] arr=new String[100];
		
		for(int i=0; i<100; i++)
		{
			arr[i]="A"+i;
			
		}
		for(int i=0; i<100; i++)
		{
			System.out.println(arr[i]);	
		}
				
	}

}
