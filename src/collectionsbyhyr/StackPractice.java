package collectionsbyhyr;

import java.util.Stack;

public class StackPractice {

	public static void main(String[] args) {
		/*
		 * LIFO - Last in first out - Stack
		 * FIFO - First in first out - Queue
		 * 
		 * Stack is a class in java which implements the list interface and 
		 * extends the vector class and also represnts the LIFO principle
		 */
		Stack<String> books = new Stack<>();
		books.add("White");
		books.add("red");
		books.add("orange");
		books.push("grapes");
		// some methods from vector class available but we special methods from Stack those are
		
		System.out.println(books.peek());
		System.out.println(books.pop());
		System.out.println(books.peek());
		System.out.println(books.search("orange"));
	}

}
