package java_prog.intreface;

public class InterfaceANo {

	public static void main(String[] args) {

//		Hyndai h=new Hyndai() {
//			
//		};
//		h.speed("Hii");
//		
		
		
		Car c=new Car()
				{

					
					public void speed(String str) 
					{
						System.out.println("240 kmph..");
					}

					@Override
					public void Height() 
					{
						System.out.println("6 fit..");
					}
					
				};
				c.Height();
				c.speed("123");
	}

}
interface Car
{
	void speed(String str);
	
	void Height();
}
