package java_prog.LambdaExpre;

public class AddNo {

	public static void main(String[] args) {

		Add s=(x,y)->x+y;
		
		System.out.println(s.sum(20,30));
	}
}
interface Add
{
	int sum(int a, int b);
}
