package java_prog.loops;

public class EvenSum {
	public static void main(String args[]) {
		
		
		int sum=0;//0+1+2+3+4+5
		// 1-5 =>0+2+4=>6
		// 1-10=>2,4,6,8,10=>30
		   for(int num=1;num<=10;num++)
		   {
			  // sum=sum+num;
			  //1,2,3,4,5
			   if(num%2==0)
			   {
				   
				   sum=sum+num; //0+2+4+6+8+10
			   }
			 
		   }
		  
		   
		   System.out.println(sum);
	}

}
