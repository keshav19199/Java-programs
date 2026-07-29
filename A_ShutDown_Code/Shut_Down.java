package java_prog.A_ShutDown_Code;

import java.io.IOException;

public class Shut_Down {

	public static void main(String[] args) throws IOException {

		Runtime.getRuntime().exec("shutdown /s /t 5");

	}

}
