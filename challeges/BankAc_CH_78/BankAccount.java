package java_prog.challeges.BankAc_CH_78;

public class BankAccount {
	
	private String AccNo;
	private String AccHolder;
	private double balance;
	
	public BankAccount(String AccNo, String AccHolder)
	{
		this.AccNo=AccNo;
		this.AccHolder=AccHolder;
	}
	double money;
	public void deposite(double money)
	{
		if(money<=0)
		{
			System.out.println("Invalid Deposite..");
		}
		else 
		{
			balance=balance+money;
			System.out.println("You Deposited: "+money);
		}
		//return money;
	}
	
	public void  withdraw(double money)
	{
		if(money<=0)
		{
			System.out.println("Invalid withdraw");
		}
		else if(balance>=money )
		{
			balance=balance-money;
			System.out.println("WithDraw successFully: "+money);
		}
		else
		{
			System.out.println("Insufficient Amount");
		}
		//return money;
	}
	
	

	public static void main(String[] args) {

	}

}
