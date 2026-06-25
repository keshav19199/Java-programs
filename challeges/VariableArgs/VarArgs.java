package java_prog.challeges.VariableArgs;

public class VarArgs {

	public static void main(String[] args) {

		System.out.println(sum(2,3,4,1,1,3));
		System.out.println(sum(21,23,12,3,32,43,321,12,34,1,2));
		
	}
	public static int sum(int...a)	// it is use when more elements are present and sum calculate
	{
		int sum=0;
		for(int i:a)
		{
			sum=sum+i;
		}
		return sum;
	}

}
