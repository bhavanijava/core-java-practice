package collectionsbyhyr;

import java.util.PriorityQueue;

public class PriorityQueuePractice {

	public static void main(String[] args) {
		//creation of PriorityQueue
		// default lowest integer is priority here but if you need hihest value as priority pass Comparator.reverse order
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();    
		//PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());    

		//addition of elements
		// add and offer are both same
		priorityQueue.add(3);
		priorityQueue.add(1);
		priorityQueue.add(7);
		priorityQueue.offer(4);

		//retrival of elements
		// peek will return 0th element
		System.out.println(priorityQueue.peek());

		//remove of elements
		//poll will remove 0th element
		//remove will remove 0th element
		//priorityQueue is empty poll will return null but remove throw exception
		//System.out.println(priorityQueue.poll());
		//System.out.println(priorityQueue.remove());

		System.out.println(priorityQueue);
		// donot use for each instead use while loop
		for(Integer pq: priorityQueue) {
			//System.out.println(pq);
		}
		
		while(!priorityQueue.isEmpty()) {
			System.out.println(priorityQueue.poll());
		}
		
		// removing all at a time
		priorityQueue.clear();
	}

}
