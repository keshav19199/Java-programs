package java_prog.StreamAPI_Revision;

public class Third {

	public static void main(String[] args) {

		I_Car<String, Integer> ab=(i,j)->(i.length()+j);
		
		System.out.println(ab.wheel("hello", 12));
		
	}

}
interface I_Car<T,R>
{
	int wheel(T t1, R i);
}
