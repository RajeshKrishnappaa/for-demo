public class DSCircularQueue {
    public static void main(String[] args) {
        Circular_Queue cq= new Circular_Queue(5);    
        cq.Enqueue(0);
        cq.Enqueue(1);
        cq.Enqueue(2);
        cq.Enqueue(3);
        cq.Dequeue();
        cq.display();
    }
}

class Circular_Queue{ 
    int max_size;
    int Circular_Array[];
    int front;
    int rear;

    public Circular_Queue(int max_size){ 
        this.max_size=max_size;
        this.Circular_Array=new int[max_size];
        this.front=-1;
        this.rear=-1;
    }

    public boolean isFull(){
       if(this.front==0 && this.rear==max_size-1){
        return true;
       }
    if(this.front==this.rear+1){
        return true;
    }
    return false;
}

public void Enqueue(int data){
if(this.isFull()){
    System.out.println("Queue is Full");
    return;
}
if(this.front==-1){
    front=0;
}
this.rear=(this.rear+1)%this.max_size;
this.Circular_Array[this.rear]=data;
}

public void display(){
    if (this.isEmpty()) {
        System.out.println("Queue is Empty");
        return;
    }

    System.out.print("Queue elements: ");
    int i = this.front;
    while (true) {
        System.out.print(this.Circular_Array[i] + " ");
        if (i == this.rear) {
            break;
        }
        i = (i + 1) % this.max_size;
    }
    System.out.println();
}


public boolean isEmpty(){
    return this.front==-1;
}

public int Dequeue(){
    if(this.isEmpty()){
        System.out.println("Queue is Empty");
        return -1;
    }
    int element=this.Circular_Array[this.front];
    if(this.front==this.rear){
        this.front=-1;
        this.rear=-1;
    }else{
        this.front=(this.front+1)%this.max_size;
    }
    return element;
}

}


