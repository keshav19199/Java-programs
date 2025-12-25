package java_prog.objectMethods;

public class Contract_Exception {

	public static void main(String[] args) {


		Phone ph=new Phone();
		ph.id=12;
		ph.model="sam";
		ph.price=234.34;
		
		Phone ph1=new Phone();
		ph1.id=12;
		ph1.model="sam";
		ph1.price=234.34;
		
		System.out.println(ph.hashcode());
		System.out.println(ph.hashcode());
		
	}

}
class Phone
{
	int id;
	String model;
	double price;
	
	public int hashcode()
	{
		return this.id+(int)this.price+this.model.hashCode();

		//return this.id+this.model+this.price.hashcode();
	}
}
