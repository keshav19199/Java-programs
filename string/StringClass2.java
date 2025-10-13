package java_prog.string;

public class StringClass2 {

	public static void main(String[] args) {


		StringBuilder sb=new StringBuilder("abc");
		System.out.println(sb);
		
		StringBuilder sb2=sb.append("def");
		System.out.println(sb);
		System.out.println(sb2);
		
		System.out.println(sb==sb2);
	}

}
