package java_prog.loops;

public class WhileLoop {
	public static void main(String[] args) {
		
		int num=1;
		int count=0;
		
		while(num<1000)
		{
			System.out.println(" "+num);
			num++;
			count++;
		}
		System.out.println("Total: "+count);
	}

}
