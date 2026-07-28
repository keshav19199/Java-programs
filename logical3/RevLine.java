package java_prog.logical3;

public class RevLine {

	public static void main(String[] args) {

		String str="Welcome to Pune!";
		String arr[]=str.split(" ");
		
		for(String rev:arr)
		{
			StringBuffer sb=new StringBuffer(rev);
			System.out.print(sb.reverse()+" ");
		}
	}

}
