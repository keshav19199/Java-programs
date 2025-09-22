package java_prog.operations;

public class Arithmetic3 {
	public static void main(String[] args) {
	
		// increment and decrement
		
		int marks=40;
		
		marks++;	//40
		--marks;	//40
		++marks;	//41
		marks--;	//40
		
		System.out.println((--marks)+ (--marks)+ (marks++)+ (++marks)+ (marks++)+ (++marks));
							//39+38+38+40+40+42
		//System.out.println(39+38+38+40+40+42);
	}
	

}
