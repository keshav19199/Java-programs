package java_prog;

public class ForEachLoop3 {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,5,6,7,8,9,0};
		
		for(int a: arr)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		
		String[] arr2={"ram","shyam","gita","sita"};
		for(String name:arr2)
		{
			System.out.print(name+", ");
		}
	}

}
