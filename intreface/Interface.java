package java_prog.intreface;

public class Interface {

	public static void main(String[] args) {

		Ianimal ian=new Lion();
		Ianimal ia=new Lion();
		
		ian.hunt("Dukkar");
		ian.run(null);
		
		ia.sleep(3, 5);
		
		Lion L=new Lion();
		L.drink("Water");
		L.hunt("Deer");
		L.run("Fast");
		L.sleep(16);
		L.sleep(05, 12);
		
	}

}


interface Idrink
{
	int drink(String str);
}



interface Ianimal
{
	void sleep(int i);
	
	void sleep(int i, int j);
	
	void run(String str);
	
	void hunt(String str);
}
class Lion implements Ianimal, Idrink
{
	public void sleep(int i)
	{
		System.out.println("Animal sleep also"+ i +"hours");
	}
	public void sleep(int i, int j)
	{
		System.out.println("most animals also sleep "+ i +" Hours. And Somes Animals are "+ i +" Hours.");
	}
	public void run(String str)
	{
		System.out.println(str);
	}
	public void hunt(String str)
	{
		System.out.println(str);
	}
	@Override
	public int drink(String str) {
		// TODO Auto-generated method stub
		return 0;
	}
}
