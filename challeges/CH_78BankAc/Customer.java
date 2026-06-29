package java_prog.challeges.CH_78BankAc;

public class Customer {

	public static void main(String[] args) {

		BankAccount acc=new BankAccount("001","Keshav Wadhavane");
		
		acc.deposite(100);
		acc.withdraw(90);
		//System.out.println(acc.withdraw(5000));
		
		acc.deposite(43);
		acc.withdraw(10000);
		
		
	}

}
