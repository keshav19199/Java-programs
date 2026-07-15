package java_prog.challeges.Functional;

import java.util.Optional;


public class Challenge_112 {

	public static void main(String[] args) {
	
		System.out.println(toOptional(null));
		System.out.println(toOptional(" "));
		System.out.println(toOptional("Hello"));
	}
	public static Optional<String> toOptional(String str)
	{
		if(str==null || str.isEmpty() || str.isBlank())
		{
			return Optional.empty();
		}
		return Optional.of(str.toUpperCase());
	}
}
