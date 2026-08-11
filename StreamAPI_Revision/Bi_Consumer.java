package java_prog.StreamAPI_Revision;

import java.util.function.BiConsumer;

public class Bi_Consumer {

	public static void main(String[] args) {

		BiConsumer<String, Integer> con=(i,j)->{System.out.println(i.length()+3);};
		
		con.accept("nine",3);
	}

}
