package java_prog.challeges;

public class MathClasses {

	public static void main(String[] args) {

		double num=34.55;
		
		double num2=Math.abs(num);
		
		System.out.println("Abs    "+num2);
		System.out.println("ceil   "+Math.ceil(34.55));
		System.out.println("floor  "+Math.floor(34.55));
		System.out.println("round  "+Math.round(34.55));
		System.out.println("sqrt   "+Math.sqrt(34.55));
		System.out.println("exp    "+Math.exp(34.55));
		System.out.println("sin    "+Math.sin(34.55));
		System.out.println("cos    "+Math.cos(34.55));
		System.out.println("tan    "+Math.tan(34.55));
		
		System.out.println("PI: "+Math.PI);
		
		System.out.println();
		
		int i=0;
		while(i<5)
		{
			i++;
			int random=(int)Math.round(Math.random() * 100);
			System.out.println(random);
		}
	}

}
