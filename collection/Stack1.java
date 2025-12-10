package java_prog.collection;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {

		
		Stack<Integer> stack=new Stack<Integer>();
		
		stack.push(23);
		stack.push(12);
		stack.push(54);
		stack.push(98);
		
		System.out.println(stack.peek());		//give you head of element
		System.out.println(stack.search(98));	//search from top of element i.s 98
		
		System.out.println("**************************");

		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
		
		
	}

}
