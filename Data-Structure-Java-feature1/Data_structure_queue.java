public class Data_structure_queue {
    public static void main(String[] args) {
       queue q = new queue(5); 
         q.enqueue(10);
         q.enqueue(20);
         q.enqueue(30);
         q.enqueue(40);
         q.enqueue(50);
         //q.enqueue(60);
         //q.dequeue();
         q.display();
         q.dequeue();
         System.out.println();
         q.display();

        //  while(!q.isEmpty()){  
        //     int element = q.dequeue();
        //     System.out.println(element);
        //  }
    }
}

class queue{
    int front =-1;
    int rear = -1;
    int max_size=0;
    int queue_array[];

    public queue(int max_size){// Constructor to initialize the queue
        this.max_size = max_size;
        this.queue_array = new int[max_size];
    }

    public boolean isFull(){
        return this.rear==this.max_size-1;
    }

    public void enqueue(int data){
        if(this.isFull()){
            System.out.println("Queue is full");
            return;
        }
            if(this.front==-1){
                this.front=0;
            }
            this.rear++;
            this.queue_array[this.rear]=data;
    }

    public boolean isEmpty(){
        return this.front==-1;
    }

    public int dequeue(){
        if(this.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }

        int current_element=this.queue_array[this.front];

        if(this.front==this.rear){
            this.front=-1;
            this.rear=-1;
        }
        else{
            this.front++;
        }
        return current_element;
    }

    public void display() {
    if (this.isEmpty()) {
        System.out.println("Queue is Empty");
        return;
    }
    System.out.print("Queue elements: ");
    for (int i = front; i <= rear; i++) {
        System.out.print(queue_array[i] + " ");
    }
    System.out.println();
}

}


