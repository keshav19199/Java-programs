package java_prog.challeges.CH_82_Array;

public class TestArrayOPerations {

	public static void main(String[] args) {

		ArrayOperations op=new ArrayOperations(new int [] {1,3,5,9});
		ArrayOperations.Statistics statistics=op.new Statistics();
		
		System.out.println(statistics.mean());
		
		
	}

}
