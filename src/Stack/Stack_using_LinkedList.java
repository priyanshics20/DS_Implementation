package Stack;

public class Stack_using_LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode; ////***
        } else {
            newnode.next = head;
            head = newnode;
        }
        System.out.println("element is pushed " + data);
    }

    public void pop() {
        if (isEmpty())
            System.out.println("stack is empty, UnderFlow");
        else {
            System.out.println("Poped element is "+ head.data);
            head = head.next;
        }
    }

    public void peek(){
        System.out.println("peek element "+ head.data);
    }


    public void printAll(){
        if(isEmpty())
            System.out.println("Stack is empty");
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Stack_using_LinkedList stack = new Stack_using_LinkedList();
        stack.push(67);
        stack.push(56);
        stack.push(65);
        stack.printAll();
        stack.peek();
        stack.pop();
        stack.push(34);
        stack.peek();
        stack.printAll();
    }
}

