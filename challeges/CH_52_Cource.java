package java_prog.challeges;

public class CH_52_Cource {
	public static void main(String[] args) {
		
		int num;
		
		num=90;
		num=88;
		System.out.println(num);
		
		
		
		
	}

}
class Cource
{
	static int maxCapacity=100;
	String courceName;
	int enroll;
	
	Cource(String courceName)
	{
		this.courceName=courceName;
		this.enroll=0;
	}
	
	static void setMaxCapacity(int maxCapacity)
	{
		Cource.maxCapacity=maxCapacity;
	}
	
	
	String[] enrollStudent=new String[maxCapacity]; 
	
	void enrollStudent(String studentName)
	{
		enrollStudent[enroll]=studentName;
		enroll++;
	}
	
	void unEnrollStudent(String studentName)
	{
		System.out.println("Student removed..");
		enroll--;
	}
	

}

