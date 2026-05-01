// print the student marks high,moderate and low.

package java_prog.challeges;


public class CH_56_StudentCourceTernary {

	public static void main(String[] args) {
		
		int marks=49;
		String result=marks>=80 ? "high":(marks>=50 ? "mediator":"low");
		
		// this is double ternary operator used.
		
		System.out.println(result);
		
	}

}
