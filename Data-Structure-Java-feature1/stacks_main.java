public class stacks_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack_1 s = new stack_1(5);
		
		s.push(0);
		s.push(1);
		s.push(2);
		//System.out.println(s.isEmpty());
		System.out.println(s.peek());
//		s.push(1);
//		s.push(2);
//		s.push(3);
		//s.push(4);
		//s.push(5);//if its there overflow occurs
		//s.print_data();
		System.out.println(s.top); 
		boolean flag=s.isEmpty();
		System.out.println(flag);
		
		s.recursive(6);
	}	
	}
class stack_1{
	int size;
	int stackArray[];
	int top;
	
	public stack_1(int size) {
		this.size=size;
		this.top=-1;
		this.stackArray=new int[size];
	}
	
public void push(int data) {
	if(this.isFull()) {
		System.out.println("Stack is full and stackoverflow will occur");
		return;
	}
	this.top++;
	this.stackArray[this.top]=data;
}
public boolean isFull() {
	return this.top==(this.size-1);
}
//public void print_data() {
//	for(int i:this.stackArray) {
//		System.out.println(i);
//	}
//}
public boolean isEmpty() {
	return top==-1;
}
public int pop() {
	if(this.isEmpty()) {
		System.out.println("Stack is Empty and causes stack underflow");
		return -1;
	}
	return this.stackArray[this.top--];
}

public int peek() {
	if(this.isEmpty()) {
		System.out.println("Stack is Empty and causes stack underflow");
		return -1;
	}
	return this.stackArray[this.top];
}
public int recursive(int n) {
	if(n==0) {
		System.out.println(0);
		return 0;
	}
	System.out.println(n);
	return recursive(n-1);
}
}
