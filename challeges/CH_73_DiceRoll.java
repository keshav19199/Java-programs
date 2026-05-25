package java_prog.challeges;

public class CH_73_DiceRoll {
	
	int roll()
	{
		double random=Math.random()*6;
		return (int) Math.ceil(random);
	}

	public static void main(String[] args) {

		CH_73_DiceRoll dice=new CH_73_DiceRoll();
		
		System.out.println("Random gussing: ");
		for(int i=0; i<5; i++)
		{
			System.out.println(dice.roll());
		}
		
	}

}
