package java_prog.challeges.Threads;

public enum Color {
	
	Red(9000),
	Yellow(1000),
	Green(3000);
	
	 private final int time;
	 
	
	 Color(int time)
	{
		this.time=time;
	}
	 
	 public int getTime()
	 {
		 return time;
	 }
}