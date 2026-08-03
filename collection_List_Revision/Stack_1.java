package java_prog.collection_List_Revision;

import java.util.Stack;

public class Stack_1 {

	public static void main(String[] args) {

		Stack<Integer> stack=new Stack();
		
		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(15);
		stack.push(16);
		
		System.out.println(stack);
		
		System.out.println(stack.peek());
		stack.pop();	// LIFO
		
		stack.pop();
		System.out.println(stack.peek());

		System.out.println(stack);
	}

}
