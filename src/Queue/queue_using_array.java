package Queue;

public class queue_using_array {
    int front;
    int rear;
    int arr[];

    public queue_using_array(int size){
        arr = new int[size];
        front =-1;
        rear = -1;
    }

    public boolean isEmpty(){
        if(front==-1)
            return true;
        return false;
    }

    public boolean isFull(){
        if(rear == arr.length-1)
            return true;
        return false;
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("Overflow");
        }
        else if(isEmpty()){
            front++;
            rear++;
            arr[rear]=data;
        }
        else {
            rear++;
            arr[rear]=data;
        }
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Underflow");
        }
        System.out.println("dequeue element "+arr[front]);
        front++;
        if(front>rear)
            front=rear=-1;
    }

    public void printAll(){
        for(int i=front;i<=rear;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        queue_using_array queue = new queue_using_array(4);
        queue.enqueue(98);
        queue.enqueue(99);
        queue.printAll();
        queue.dequeue();
        queue.enqueue(78);
        queue.printAll();
    }
}
