public class SingleLL_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList sl = new SinglyLinkedList();
		sl.insert_at_begin(1);
		sl.insert_at_begin(0);
		sl.insert_at_end(3);
		sl.insert_at_middle(2,2);
		//sl.delete_at_beginning();
		//sl.delete_at_end();
		sl.delete_at_middle(2);
		//sl.display();
		int ans = sl.search(3);
		System.out.println(ans);
	}
}

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

class SinglyLinkedList{
	Node head=null;

//insertion at begining
public void insert_at_begin(int data) {
	Node new_node= new Node(data);
	
	if(head == null) {
		head = new_node;
		return;
	}
	
	new_node.next=head;
	head=new_node;
}

//insertion at end
public void insert_at_end(int data) {
	Node new_node= new Node(data);
	
	if(head==null) {
		head = new_node;
		return;
	}
	Node current_node=head;
	while(current_node.next!=null) {
		current_node=current_node.next;
	}
	current_node.next=new_node;
}

//insertion at middle
public void insert_at_middle(int position,int data) {
	Node new_node=new Node(data);
	
	if(position==0) {
		new_node.next=head;
		head=new_node;
		return;
	}
	Node current_node=head;
	int count=0;
	
	while(current_node!=null && count<position-1) {
		current_node=current_node.next;
		count++;
	}
	if(current_node==null) {
		System.out.println("Position is out of linked list");
		return;
	}
	new_node.next=current_node.next;
	current_node.next=new_node;
}

//traversal
public void display(){
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
   // System.out.println("null");
}

//Deletion at Beginning
public void delete_at_beginning() {
	if(head == null) {
		System.out.println("No elements to delete");
	}
	head = head.next;
}

//Deletion at end
public void delete_at_end() {
	if(head == null) {
		System.out.println("No elements to delete");
		return;
	}
	if(head.next==null) {
		head=null;
		return;
	}
	Node current=head;
	Node prev = null;
	
	while(current.next!=null) {
		prev = current;
		current = current.next;
	}
	prev.next=null;
}

//Deletion at the middle
public void delete_at_middle(int position) {
	if(head == null) {
		System.out.println("No elements to delete");
		return;
	}
	if(position==0) {
		head = head.next;
		return;
	}
	Node current = head;
	Node prev = null;
	int count = 0;
	
	while(current!=null && count<position) {
		prev = current;
		current = current.next;
		count++;
	}
	if(current == null) {
		System.out.println("Position is greater");
		return;
	}
	prev.next = current.next;
}

//Search an element in Linked List
public int search(int value) {
	if(head == null) {
		return -1;
	}
	if(head.next == null && value == head.data) {
		return -1;
	}
	Node current = head;
	int position = 0;
	while(current!=null) {
		if(current.data == value) {
		return position;	
		}
		current = current.next;
		position++;
	}
	return -1;
}
}
