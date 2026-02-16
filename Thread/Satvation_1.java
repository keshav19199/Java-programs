package java_prog.Thread;

public class Satvation_1 {
	public static void main(String args[]) {
		
		Thread t1=new Thread(()->{
			int i=0;
			while(i<100)
			{
				
				while(true) {
					while(true) {
						while(true) {
							
							
							
							try {
								Thread.sleep(5000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
				System.out.println("Thread 1");
				//i++;
						}
					}
				}
			}
		});
		Thread t2=new Thread(()->{
			
			int i=0;
			while(i<100)
			{
				
				while(true) {
					while(true) {
						while(true) {
							
							
							
							try {
								Thread.sleep(5000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
				System.out.println("***Thread 2");
				//i++;
						}
					}
				}
			}
		});
		Thread t3=new Thread(()->{
			
			int i=0;
			while(i<100)
			{
				try {
				Thread.sleep(5000);
				}
				catch(Exception e)
				{
					System.out.println("Exception generate");
				}
				
				System.out.println("************************** thread 3..");
				//i++;
			}
		});
		
		
		t1.setPriority(10);
		t2.setPriority(10);
		t3.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
