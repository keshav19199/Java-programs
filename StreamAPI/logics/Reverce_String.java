package java_prog.StreamAPI.logics;

import java.util.List;

public class Reverce_String {

	public static void main(String[] args) {

		List.of("abcd","efgh","ijklmn","opqrst")
		.stream()
		.map(StringBuffer::new)	//StringBuffer sb=new StringBuffer(i);
		.map(StringBuffer::reverse)
		.map(StringBuffer::toString)
		.forEach(System.out::println);
	}

}
