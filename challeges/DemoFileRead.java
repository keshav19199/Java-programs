package java_prog.challeges;

import java.io.FileReader;
import java.io.IOException;

public class DemoFileRead {

	public static void main(String[] args) {

		String fileName="myFile.txt";
		
		try
		{
			FileReader fr=new FileReader(fileName);
			int read=0;
			
			do {
				read=fr.read();
				System.out.print((char)read);
			}while(read !=-1);			
		}
		catch(IOException e)
		{
			System.out.println("Exception occured"+e.getMessage());
		}
	}

}
