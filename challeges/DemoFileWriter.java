package java_prog.challeges;

import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriter {

	public static void main(String[] args) {
		String fileName="myFile.txt";
		
		try {
			
			FileWriter fw=new FileWriter(fileName);
			fw.write("This is my file, "+" Hwllo My dear Friends.. And the file location is in the challenges");
			fw.flush();
			System.out.println("File written successfully");
		}
		catch(IOException io)
		{
			System.out.println("Exception Occured"+ io.getMessage());
		}
		finally {
			
		}
	}

}
