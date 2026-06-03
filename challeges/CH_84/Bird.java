package java_prog.challeges.CH_84;

public abstract class Bird implements Fly{
	
	private final String breed;
	
	public Bird(String breed)
	{
		this.breed=breed;
	}
	
	public String getBreed()
	{
		return breed;
	}

}
