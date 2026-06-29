package java_prog.challeges.CH_97_Enum2;

public enum Day {
	monday(true),
	tuesday(true),
	wednesday(true),
	thursday(true),
	friday(true),
	saturday(false),
	sunday(false);
	
	private final boolean isWeekday;
	
	Day(boolean isWeekday)
	{
		this.isWeekday=isWeekday;
	}

	public String getType()
	{
		return isWeekday ? "Weekday":"WeekEnd";
	}

}
