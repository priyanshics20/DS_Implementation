package Linked_List;

public class Doubly_Linked_list {
    Node head;

    static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    //insert at head
    public void insert_at_head(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            newnode.prev = null;
            newnode.next = null;
        }
        newnode.prev = null;
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    //insertion at end
    public void insert_at_end(int data) {
        Node temp = head;
        Node newnode = new Node(data);
        if (temp == null) {
            temp = newnode;
            temp.prev = null;
            temp.next = null;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        newnode.prev = temp;
        temp.next = newnode;
        newnode.next = null;
    }

    //insertion at given position;
    public Node insertion_at_given_node(int pos, int data) {
        Node newnode = new Node(data);
        Node temp = head;
        int c = 1;
        if (pos < 1) {
            System.out.println("Invalid position");
            return null;
        }
        if (pos == 1){
            temp=newnode ;
            newnode.prev = null;
            newnode.next=null;
            return temp;
        }
        while (c < pos - 1) {
            temp = temp.next;
            c++;
        }
        newnode.next = temp.next;
        temp.next.prev = newnode;
        temp.next = newnode;
        newnode.prev = temp;
        return head;
    }

    // print
    public void printall(){
        Node temp = head;
        int pos = 1;
        while (temp != null) {
            System.out.println("data at "  + " is "+ temp.data);
            pos++;
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Doubly_Linked_list ll = new Doubly_Linked_list();
        //ll.insertion_at_given_node(1,10);
        //ll.insert_at_head(20);
        //ll.insert_at_head(32);
        ll.insert_at_end(34);
        ll.printall();

    }
}
