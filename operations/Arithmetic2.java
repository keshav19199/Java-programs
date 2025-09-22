package java_prog.operations;

public class Arithmetic2 {
	public static void main(String args[]) {
		
		//Decrement = pre and post
		
		int age=10;
		
		--age;  //9
		age--;	//9
		--age;	//7
		
		System.out.println((--age)+ (age--) + (age--) + (--age));
							//6+6+5+3 =20
		
	}

}
