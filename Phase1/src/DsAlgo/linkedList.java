package DsAlgo;

public class linkedList {
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data= data;
			this.next = null;
			
		}
	}
	
	public Node head = null;
	public Node tail = null;
	
	// Remove node in Linked list assignment

	public static void main(String[] args) {

		linkedList list = new linkedList();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.display();

	}

	private void display() {
		Node current = head;
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("nodes of the linked list: ");
		while(current!=null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
		System.out.println();
		
	}

	private void addNode(int data) {
		   //Create a new node    
        Node newNode = new Node(data);    
            
        //Checks if the list is empty    
        if(head == null) {    
            //If list is empty, both head and tail will point to new node    
            head = newNode;    
            tail = newNode;    
        }    
        else {    
            //newNode will be added after tail such that tail's next will point to newNode    
            tail.next = newNode;    
            //newNode will become new tail of the list    
            tail = newNode;    
		
	}

}
}
