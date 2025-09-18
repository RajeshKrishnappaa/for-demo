public class CircularLL_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circularll cl = new Circularll();
		cl.insert_at_end(1);
		cl.insert_at_end(2);
		cl.insert_at_end(3);
		cl.insert_at_begin(0);
		cl.insert_at_middle(4,1);
		cl.insert_at_end(4);
		cl.insert_at_end(5);
		cl.delete_at_middle(6);
		//cl.insert_at_end(3);
		//cl.delete_at_begin();
		//cl.delete_at_end();
		//cl.delete_at_middle(1);
		//System.out.println(cl.head.data);
		cl.traversal();
	}

}

class Node1{
	int data;
	Node1 next;
	
	public Node1(int data){
		this.data=data;
		this.next=null;
	}
}

class Circularll{
	Node1 head = null;
	
	//insert at begin
	public void insert_at_begin(int data) {
		Node1 new_node = new Node1(data);//  always create a new node
		
		if(head == null) {
			head = new_node;
			head.next=head;
			return;
		}
		
		Node1 last = head;
		while(last.next!=head) {  //stopping condition
			last=last.next;
		}
		last.next=new_node;
		new_node.next=head;
		head=new_node;
	}
	
	//insert_at_end
	public void insert_at_end(int data) {
		Node1 new_node= new Node1(data);
		
		if(head==null) {
			head = new_node;
			head.next=head;
			return;
		}
		
		Node1 last=head;
		while(last.next!=head) {
			last=last.next;
		}
		last.next=new_node;
		new_node.next=head;
	}
	
	//Insert Between nodes
	public void insert_at_middle(int data,int position) {
		Node1 new_node=new Node1(data);
		
		if(head==null) {
			head = new_node;
			head.next=head;
			return;
		}
		
		if(position == 0) {
			this.insert_at_begin(data);
		}
		int count=1;//it should not be zero , if its zero it is begining 
		Node1 current = head;
		while(count<position && current.next!=null) { //stop before one node(for condition cnt<pos
			current=current.next;
			count++;
		}
		
		if(current.next==head) {
			this.insert_at_end(data);
		}
		new_node.next=current.next;
		current.next=new_node;
	}
	
	//Traversal
	public void traversal() {
		if(head==null) {
			System.out.println("LinkedList is empty");
			return;
		}
		System.out.println(head.data);
		Node1 temp=head.next;
		while(temp!=head) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	//Delete at begin
	public void delete_at_begin() {
		if(head==null) {
			System.out.println("linkedlist is empty");
			return;
		}
		if(head.next==head) {
			head=null;
		}
		Node1 last=head;
		while(last.next!=head) {
			last=last.next;
		}
		head=head.next;  //shift head to next
		last.next=head;
	}
	
	//Delete at end
	public void delete_at_end() {
		if (head==null) {
			System.out.println("linkedlist s empty");
			return;
		}
		
		if(head.next==head) {
			head=null;
		}
		
		Node1 prev=null;
		Node1 current=head;
		
		while(current.next!=head) {
			prev=current;
			current=current.next;
		}
		prev.next=head;
		
	}
	
	//Delete at middle
	public void delete_at_middle(int position) {
		if(head==null) {
			System.out.println("Linkedlist is empty");
			return;
		}
		if(position==0) {
			this.delete_at_begin();
		}
		
		Node1 prev=null;
		Node1 current=head;
		int count=1;
		
		while(count<=position && current.next!=head) {
			prev=current;
			current=current.next;
			count++;
		}
		if(current.next==head) {
			this.delete_at_end();
		}
		prev.next=current.next;
	}
}


