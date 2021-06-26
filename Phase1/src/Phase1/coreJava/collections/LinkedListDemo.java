package Phase1.coreJava.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>ll = new LinkedList<String>();
		
		//ll.addLast("December");
		ll.add("January");
		
		ll.add("Feb");
		ll.add("March");
		ll.add("April");
		
		System.out.println("Linked List is: " + ll);
		
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println("print with iterator " + itr.next());
			
		}
		System.out.println("size of Linked List= " + ll.size());
		
		//System.out.println("size of List= " + ll.size());
		ll.add("Sept");
		ll.add("Oct");
		
		System.out.println("size of Linked List= " + ll.size());
		Iterator itr1 = ll.iterator();
		while(itr1.hasNext()) {
			System.out.println("print with iterator " + itr1.next());
			
		}
		ll.add(4,"May");
		ll.add(5,"June");
		ll.add(6,"July");
		ll.add(7,"August");
		
		Iterator itr2 = ll.iterator();
		while(itr2.hasNext()) {
		System.out.println("print with iterator2 " + itr2.next());
		}
		
		ll.add("November");
		ll.addLast("December");
		ll.addFirst("Hi");
	/*	Iterator itr3 = ll.iterator();
		while(itr3.hasNext()) {
			System.out.println("final List " + itr3.next());
	}*/
		Iterator<String> newItr = ll.iterator();
		newItr.forEachRemaining(element -> System.out.println(element));
	}
}
