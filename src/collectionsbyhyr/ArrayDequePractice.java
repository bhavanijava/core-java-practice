package collectionsbyhyr;

import java.util.ArrayDeque;

public class ArrayDequePractice {

	public static void main(String[] args) {
		// creation of arrayDeque
		ArrayDeque<String> arrayDeque = new ArrayDeque<>();    

		// addtion of elements
		arrayDeque.add("Banana");
		arrayDeque.addFirst("Mango");
		arrayDeque.addLast("Carrot");
		//add and addLast are same

		arrayDeque.offer("soap");
		arrayDeque.offerFirst("ass");
		arrayDeque.offerLast("sfdv");
		//offer and offerLast are same

		//expected output:- ass,Mango,Banana,Carrot,soap,sfdv
		System.out.println(arrayDeque);

		// retrival of elements
		// peek and peekFirst are same
		System.out.println(arrayDeque.peek());
		System.out.println(arrayDeque.peekFirst());
		System.out.println(arrayDeque.peekLast());

		// remove of elements
		// poll and pollFirst are same
		System.out.println(arrayDeque.poll());
		System.out.println(arrayDeque.pollFirst());
		System.out.println(arrayDeque.pollLast());
		System.out.println(arrayDeque);

	}

}
