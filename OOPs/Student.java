package java_prog.OOPs;

public class Student {

	public static void main(String[] args) {

		Stud student=new Stud();
		student.setname("Keshav");
		System.out.println(student.getname());
		
		student.setRollno(3009);
		System.out.println(student.getRollno());
		
		student.setstud_class("Sybsc-cs");
		System.out.println(student.getstud_class());
		
		student.setmobile("9834283134");
		System.out.println(student.getmobile());
		
		student.setmarks(37.43);
		System.out.println(student.getmarks());
		
		student.setemail("abc@gmail.com");
		System.out.println(student.getemail());
		
		student.setpassword("kk@213");
		System.out.println(student.getpassword());
		
		student.setcity("pune");
		System.out.println(student.getcity());
		
	}

}
class Stud
{
	String name;
	int Rollno;
	String stud_class;
	private double marks;
	private String mobile;
	private String email;
	private String password;
	String city;
	int pincode;
	
	
	
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return this.name;
	}
	
	
	
	
	public void setRollno(int Rollno)
	{
		this.Rollno=Rollno;
	}
	public int getRollno()
	{
		return this.Rollno;
	}
	
	
	public void setstud_class(String stud_class)
	{
		this.stud_class=stud_class;
	}
	public String getstud_class()
	{
		return this.stud_class;
	}
	
	
	
	public void setmobile(String mobile)
	{
		if(mobile.length()!=10)
		{
			System.out.println("Invalid number..");
		}
		else
		{
			System.out.print("+91");
			this.mobile=mobile;
		}
	}
	public String getmobile()
	{
		return this.mobile;
	}
	
	
	public void setmarks(double marks)
	{
		if(marks<35 || marks>100)
		{
			System.out.println("Fail");
		}
		else 
		{
			this.marks=marks;
		}
	}
	public double getmarks()
	{
		return this.marks;
	}
	
	
	
	public void setemail(String email)
	{
		if(email.endsWith("@gmail.com"))
		{
			this.email=email;
		}
		else
		{
			System.out.println("Invalid Email");
		}
		
	}
	public String getemail()
	{
		return this.email;
	}

	
	
	public void setpassword(String password)
	{
		if(password.length()<6 || password.length()>15)
		{
			System.out.println("Please enter the password between 6 to 15 range.");
		}
		else
		{
			this.password=password;
		}
		
	}
	public String getpassword()
	{
		return this.password;
	}
	
	
	
	public void setcity(String city)
	{
		this.city=city;
	}
	public String getcity()
	{
		return this.city;
	}
	
	
	
	public void setpincode(int pincode)
	{
		this.pincode=pincode;
	}
	public int getpincode()
	{
		return this.getpincode();
	}
	
	
	
}

