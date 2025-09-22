package java_prog.operations;
public class Arithmetic
{
	public static void main(String[] args) {
		// arithmetic
		//Plus ++
		//increment=> Pre and Post 
		
		//Pre
		int num=10;
		System.out.println(++num);
		System.out.println(++num);
		System.out.println((10)+ ++num);

		//Post
		int num2=5;
		System.out.println(num2++);
		System.out.println(num2);
		
		int age=20;
		System.out.println((age++) + (++age) + (age++) + (age++)+ (++age));
						// 20+22+22+23+25
		//System.out.println(20+22+22+23+25);
		
		
				
	}
}
