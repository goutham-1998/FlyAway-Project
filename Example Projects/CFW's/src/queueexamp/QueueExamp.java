package queueexamp;
import java.util.PriorityQueue;
import java.util.Iterator;

public class QueueExamp {

	public static void main(String[] args) {
		PriorityQueue<String>queue = new PriorityQueue<String>();
		queue.add("Person1");
		queue.add("Person2");
		queue.add("Person3");
		queue.add("Person4");
		queue.add("Person5");
				
		System.out.println("The persons present in the Queue are: "+queue);
		
		queue.offer("Person6");
		System.out.println("Queue after adding another person is: "+queue);
		
		System.out.println("Head element : "+queue.peek());
		
		queue.poll();
		System.out.println("After removing the elements : "+queue);
		
		queue.remove();
		System.out.println("After removing the elements : "+queue);
		
		Iterator itr = queue.iterator();
		System.out.println("Elements remaining in the stack are: ");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
