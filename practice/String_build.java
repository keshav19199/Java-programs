package java_prog.practice;

public class String_build {

	public static void main(String[] args) {

		String str="qwertyuiop";
		
		StringBuilder sb=new StringBuilder(str).reverse();
		
		
		System.out.println(sb);
	}

}
