package java_prog.StreamAPI_Revision;

import java.util.function.Consumer;

public class Comsumer_1 {

	public static void main(String[] args) {

		Consumer<String> con=(s)->{System.out.println(s.toUpperCase());};
		
		con.accept("21cxdcwe213keshavanvva");
		
		Consumer<String> con2=con.andThen((l)->{System.out.println(l.toLowerCase());});
		
		con2.accept("keshav HELLO DEVElopers.. java..");
	}

}
