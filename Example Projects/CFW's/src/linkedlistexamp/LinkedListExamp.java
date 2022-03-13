package linkedlistexamp;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListExamp {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("One");
		ll.add("Two");
		ll.add("Three");
		ll.add("Three");
		ll.add("Four");
		ll.add("Four");
		ll.add("Five");
		ll.add("Five");
		
		System.out.println("Elements in the list are : "+ll+"\n");
		
		
		
		Iterator it = ll.iterator();
		System.out.println("Elements after iterating :");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		it = ll.descendingIterator();
		System.out.println("\nElements after Iterating in Reverse Order :");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
