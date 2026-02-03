package java_prog.multiThreading;

public class MultiThread_4 {

	public static void main(String[] args) {

	//	Thread t1= new Thread(()->{
			
			int count=0;
			for(int i=1; i<100; i++) 
			{
				for(int j=0; j<i; j++)
				{
					Boolean flag=true;
					if(i%j==0)
					{
						flag=false;
					}
					if(flag)
					{
						System.out.println(j);
						count++;
					}
				}
			}//});
		
	//	t1.start();
	}

}
