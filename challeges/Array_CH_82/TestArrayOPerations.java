package java_prog.challeges.Array_CH_82;

public class TestArrayOPerations {

	public static void main(String[] args) {

		ArrayOperations op=new ArrayOperations(new int [] {1,3,5,9});
		ArrayOperations.Statistics statistics=op.new Statistics();
		
		System.out.println(statistics.mean());
		
		
	}

}
