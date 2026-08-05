package java_prog.Map_revision;

import java.util.Hashtable;

public class Hash_Table {

	public static void main(String[] args) {

		Hashtable<Integer, String> table=new Hashtable<Integer, String>();
		
		// no allow null key and value;
		
		table.put(1, "karuna");
		table.put(12, "kagana");
		table.put(4, "Ranu");
		table.put(0, "pitu");
		
		System.out.println(table);
	}

}
