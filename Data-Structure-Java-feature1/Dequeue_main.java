public class Dequeue_main {
    public static void main(String[] args) {
        Dequeue dq=new Dequeue(5);
        dq.insert_end(1);
         dq.insert_front(2);
         dq.insert_front(3);
         dq.insert_front(4);
         dq.insert_end(10);
         dq.delete_end();
         dq.display();
    }
}

class Dequeue{
    int Dequeue_Array[];
    int front,rear,size;

    public Dequeue(int size){
        this.size=size;
        this.front=-1;
        this.rear=-1;
        this.Dequeue_Array=new int[size];
    }

    public boolean isFull(){
        return((this.front==0 && this.rear==this.size-1) || this.front==this.rear+1);
    }

    public boolean isEmpty(){
        return this.front==-1;  
    }

    public void insert_front(int data){
        if(this.isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(this.front==-1){
            this.front=0;
            this.rear=0;
        }
        else if(this.front==0){
            this.front=this.size-1;
        }
        else{
            this.front=this.front-1;
        }
        this.Dequeue_Array[this.front]=data;
    }

    public void insert_end(int data){
       if(this.isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(this.front==-1){
            this.front=0;
            this.rear=0;
        }
        else if(this.rear==this.size-1){
            this.rear=0;
        }
        else{
            this.rear++;
        }
        this.Dequeue_Array[this.rear]=data;
    }

    public void display() {
    if (this.isEmpty()) {
        System.out.println("Dequeue is Empty");
        return;
    }

    int i = this.front; 
    while (true) {
        System.out.println(this.Dequeue_Array[i] + "");
        if (i == this.rear) { 
            break;
        }
        i = (i + 1) % this.size; 
    }
}


public void delete_front(){
    if(this.isEmpty()){
        System.out.println("Dequeue is Empty");
        return ;
    }
    if(this.front == this.rear){
        this.front=-1;
        this.rear=-1;
    }
    else if(this.front==this.size-1){
        this.front=0;
    }
    else{
        this.front++;
    }
}

public void delete_end(){
    if(this.isEmpty()){
        System.out.println("Dequeue is Empty");
        return;
    }
    if(this.front == this.rear){
        this.front=-1;
        this.rear=-1;
    }
    else if(this.rear==0){
        this.rear=this.size-1;
    }
    else{
        this.rear--;
    }
}

}
