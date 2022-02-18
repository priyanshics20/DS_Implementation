package Queue;

public class Queue_using_LL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node front,rear;

    public boolean isEmpty() {
        if (front == null)
            return true;
        return false;
    }

    public void enqueue(int data) {
        Node newnode = new Node(data);
        if (isEmpty()) {
            front = rear = newnode;
        } else {
            rear.next = newnode;
            rear = newnode;
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("UnderFlow");
        } else {
            System.out.println( "dequeue "+ front.data);
            front = front.next;
        }
    }

    public void printAll(){
        Node h1 = front;
        while(h1!=null){
            System.out.println(h1.data);
            h1=h1.next;
        }

    }

    public static void main(String[] args) {
        Queue_using_LL queue = new Queue_using_LL();
        queue.enqueue(22);
        queue.enqueue(24);
        queue.enqueue(33);
        queue.enqueue(44);
        queue.printAll();
        queue.dequeue();
        queue.dequeue();
        queue.printAll();
    }
}
