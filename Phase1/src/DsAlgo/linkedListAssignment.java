/**
 * 
 */
package DsAlgo;

import DsAlgo.linkedList.Node;

/**
 * @author lilyf using circular linked list
 *
 */
public class linkedListAssignment {

	/**
	 * @param args
	 */

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;

		}
	}

	public Node head = null;
	public Node tail = null;

	public static void main(String[] args) {

		linkedListAssignment list = new linkedListAssignment();
		list.addBegin(10);
		list.addLast(45);
		list.addBegin(88);
		list.addLast(34);
		list.addAfter(40, 88);
		list.addAfter(77, 34);
		list.display();
	}

	private void display() {
		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("nodes of the linked list: ");
		while (current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
		System.out.println();

	}

	private void addAfter(int item, int data) {

		Node current = head;

		Node newNode = new Node(item);
		if (head == null) {
			System.out.println("List is empty");
			
		} else {
			while (current != null) {
				if (current.data == data) {
					newNode.next = current.next;
					current.next = newNode;
					break;
				}

				current = current.next;
			}
		}

	}

	private void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}

	}

	private void addBegin(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;

	}

}
