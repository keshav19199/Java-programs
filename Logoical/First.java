//Find the vowels and its print the lowercase.
package java_prog.Logoical;

public class First {

	public static void main(String[] args) {

		Demo.change("WELCOME");
		Demo.change("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		
	}

}
class Demo
{
	public static void change(String str3)
	{
		String str=str3;
		StringBuffer sb=new StringBuffer();
		
		for(int i=0; i<str.length(); i++)
		{
			String str2=null;
			if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
			{
				StringBuffer sb3= new StringBuffer();
				
				str2= sb3.append(str.charAt(i)).toString().toLowerCase();
				sb.append(str2);
			}
			else
			{
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}

}
