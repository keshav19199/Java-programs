package java_prog.logical3;

public class Second {

	public static void main(String[] args) {
		int arr[]= {10,20,40,60,78,45};
		int num=0;
		int second=0;
		int third=0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>num) {
				
				second =num;
				num=arr[i];
			}
			if(arr[i]<num && arr[i]>second)
			{
				 
				third=second;
				second=arr[i];
			
			}
			if(arr[i]<second && arr[i]>third)
			{
				third=arr[i];
				continue;
				
			}
			
		}
		System.out.println(num);
		System.out.println(second);
		System.out.println(third);
		

	}

}
