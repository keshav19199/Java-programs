package java_prog.OOPs;

public class Encapsulation {

	public static void main(String[] args) {

		Bussiness alovera=new Bussiness();
		alovera.setturnover(101);
		
		System.out.println(alovera.getTurnover());
		alovera.setGstnumber("GST1234567");
		System.out.println(alovera.getgstnumber());
	}

}
class Bussiness
{
	private double turnover;
	private String gstnumber;
	
	public void setturnover(double turnover)
	{
		if(turnover<100)
		{
			System.out.println("less than 100");
		}
		else
		{
			this.turnover=turnover;
		}
	}
	public double getTurnover()
	{
		return this.turnover;
	}
	
	
	
	public void setGstnumber(String gstnumber)
	{
		if(gstnumber.length()==10)
		{
			this.gstnumber=gstnumber;
		}
		else
		{
			System.out.println("Please enter the valid GST number..");
		}
	}
	
	
	
	public String getgstnumber()
	{
		return this.gstnumber;
	}
	
}
