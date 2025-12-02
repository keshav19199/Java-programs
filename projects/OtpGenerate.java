package java_prog.projects;

import java.util.Random;
public class OtpGenerate {

	public static void main(String[] args) {

		Random random=new Random();
		
		String OTP=" ";
		
		for(int i=1; i<=6; i++)
		{
			int digit=random.nextInt(10);
			OTP +=digit;
		}
		System.out.println(OTP);
	}

}
