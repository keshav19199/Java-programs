package java_prog.StreamAPI_Revision;

public class Second {

	public static void main(String[] args) {

		I_demo<Integer> d=(t1,t2)->(t1+t2);
		
		System.out.println(d.add(12, 21));
	}
}

interface I_demo<T>
{
	int add(T s, T s2);
}