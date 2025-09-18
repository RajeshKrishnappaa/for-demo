public class DoublyLL_main {
public static void main(String[] args) {
	DoublyLinkedList dl = new DoublyLinkedList();
	dl.insert_at_end_tail(0);
	dl.insert_at_end_tail(1);
	dl.insert_at_end_tail(2);
	dl.insert_at_end_tail(3);
	dl.insert_at_end_tail(4);
	dl.insert_at_middle(5, 3);
	dl.delete_at_begin();
	dl.delete_at_middle(3);
	//System.out.println(dl.head.data);
	//dl.forward_display();
	
	int pos = dl.search(2);
	System.out.println(pos);
}
}

class NodeD{
	int data;
	NodeD next;
	NodeD prev;
	
	NodeD(int data){
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}

class DoublyLinkedList{
	NodeD head = null;
	NodeD tail = null;
	
	//insert at begin in DLL
	public void insert_at_begin(int data) {
		NodeD new_node = new NodeD(data);
		if(head == null) {
			head = new_node;
			tail = new_node;
            return;
		}
		new_node.next=head;
		head.prev=new_node;
		head = new_node;
	}
	
	//insert at end using tail
	public void insert_at_end_tail(int data) {
		NodeD new_node=new NodeD(data);
			if(head == null) {
				head = new_node;
				tail=new_node;
				return;
			}
			
			tail.next = new_node;
			new_node.prev = tail;
			tail = new_node;
	}
	
	//insert at middle
	public void insert_at_middle(int data,int position) {
		NodeD new_node=new NodeD(data);
		
		if(head == null) {
			head = new_node;
			return;
		}
		int count = 0;
		NodeD current = head;
		
		while(current!=null && count<position-1) {
			current = current.next;
			count++;
		}
		
		if(current.next == null) {
			current.next = new_node;
			new_node.prev=current;
			tail=new_node;
		}
		current.next.prev=new_node;
		new_node.next=current.next;
		current.next=new_node;
		new_node.prev=current;
	}
	
	//Delete at first(beginning)
	public void delete_at_begin() {
		if(head==null) {
			System.out.println("LinkedList is empty");
			return;
		}
		if(head.next==null) {
			head=null;
			return;
		}
		head=head.next;
		head.prev=null;
	}
	
	//Delete at last
	public void delete_at_end() {
		if(head==null) {
			System.out.println("Linkedlist is empty");
			return;
		}
		if(head.next == null) {
			head=null;
			return;
		}
		tail=tail.prev;
		tail.next=null;
	}
	
	//Delete at desired position
	public void delete_at_middle(int position) {
		if(head==null) {
			System.out.println("Linkedlist is empty");
			return;
		}
		if(position==0) {
			head=head.next;
			head.prev=null;
			return;
		}
		NodeD current=head;
		NodeD back=null;
		int count=0;
		
		while(current!=null && count<position) {
			back=current;
			current=current.next;
			count++;
		}
		back.next=current.next;
		current.next.prev=back;
	}
	
	//Search the data
	public int search(int data) {
		int index=0;
		NodeD temp = head;
		while(temp!=null) {
			if(temp.data==data) {
				return index;
			}
			temp=temp.next;
			index++;
		}
		return -1;
	}
	
	//Display forward uses head
	public void forward_display() {
		if(head == null) {
			System.out.println("LInked list is empty");
		}
		NodeD temp=head;
		
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	//Display backward uses tail
	public void backward_display() {
		if(head == null) {
			System.out.println("LInked list is empty");
		}
		NodeD temp=tail;
		
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.prev;
		}
	}
	
}

