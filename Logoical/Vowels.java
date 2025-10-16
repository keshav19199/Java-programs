package java_prog.Logoical;

public class Vowels {

	public static void main(String[] args) {

		Demo1.change("HELLOO");
	}

}
class Demo1
{
	public static void change(String str)
	{
		String str2=str;
		StringBuffer sb=new StringBuffer();
		
		for(int i=0; i<str.length(); i++)
		{
			String str3=null;
			if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
				{
						StringBuffer sb3=new StringBuffer();
						
						str3=sb3.append(str.charAt(i)).toString().toLowerCase();
						sb.append(str3);
				}
			else
			{
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}
}
