package DsAlgo;

public class doublyLinkedList {
	
	class Node{
		int data;
		Node previous;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doublyLinkedList dList = new doublyLinkedList();
		dList.addNode(1);
		dList.addNode(2);
		dList.addNode(3);
		dList.addNode(4);
		dList.addNode(5);

		
		dList.display();
	}

	Node head,tail=null;
	
	private void addNode(int data) {
		// TODO Auto-generated method stub
		Node newNode = new Node(data);
		
		
		if(head == null) {
			head= tail=newNode;
			head.previous=null;
			tail.next=null;
		}
		else {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			tail.next=null;
		}
		
	}
	
	private void display() {
		// TODO Auto-generated method stub
		Node current = head;
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of doubly linked list: ");
		while(current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
		
	}


}
