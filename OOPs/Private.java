package java_prog.OOPs;

public class Private {

	public static void main(String[] args) {

		
		Instagram keshav=new Instagram();
		
		keshav.setpassword("@43324242");
		System.out.println(keshav.getpassword());
		
		keshav.setusername("keshav_wadhavane");
		System.out.println(keshav.getusername());
	}

}
class Instagram
{
	private String password;
	String username;
	
	public void setpassword(String password)
	{
		if(password.contains("@2"))
		{
			this.password=password;
		}
		else
		{
			System.out.println("Week password..");
		}
	}
	public String getpassword()
	{
		return this.password;
	}
	
	
	
	
	public void setusername(String username)
	{
		this.username=username;
	}
	public String getusername()
	{
		return this.username;
	}

}
