package java_prog;

import java.util.List;

public class SumOfNum {

	public static void main(String[] args) {

		List<Integer> list=List.of(1,2,3,4,5);
		
		int sum=0;
		for(int i:list)
		{
			sum=sum+i;
		}
		System.out.println("Total: "+ sum);
		System.out.println("************");
		
	}

}
