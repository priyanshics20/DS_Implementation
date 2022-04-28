package Linked_List;
public class Singly_LL {
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    //insert at head
    public Node insert_at_head(int data){
        Node newnode = new Node(data);
        if(head == null){
                head = newnode;
                return head;
        }
        newnode.next=head;
        head=newnode;
        return head;
    }

    //insert at end
    public Node insert_at_end(int data){
        Node newnode = new Node(data);
        Node temp = head;
        if(head== null){
            head= newnode;
            newnode.next=null;
            return head;
        }
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next = newnode;
        newnode.next=null;
        return head;
    }

    //insert at specific position
    public Node insert_at_given_pos(int data , int pos){
        Node newnode = new Node(data);
        int c=1;
        Node temp = head;
        if(pos<1) {
            System.out.println("Invalid position");
            return null;
        }
        if(pos == 1){
            newnode.next=head;
            head=newnode;
            return head;
        }
        while(c<pos-1){
            temp = temp.next;
            c++;
        }
        newnode.next=temp.next;
        temp.next = newnode;
        return head;
    }

    //insert before a given position
    public Node insert_before_pos(int data , int pos){
        Node newnode = new Node(data);
        if(pos<1){
            System.out.println("Invalid position");
            return null;
        }
        Node temp = head;
        int c=1;
        while(c<pos-2){
            temp=temp.next;
            c++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        return head;
    }
    // insert after a given position
    public Node insert_after_pos(int data , int pos){
        Node newnode = new Node(data);
        if(pos<1){
            System.out.println("Invalid position");
            return null;
        }
        Node temp = head;
        int c=1;
        while(c<pos){
            temp=temp.next;
            c++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        return head;
    }

    //delete head
    public Node del_head(){
        Node temp = head;
        if(head==null){
            System.out.println("list is empty");
            return null;
        }
        if(head.next == null)  return null;

        temp = temp.next;
        return temp;
    }
    //delete at end
    public Node del_end(){
        if(head== null){
            System.out.println("list is empty");
            return null;
        }
        Node temp =head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next = null;
        return head;
    }
    //delete at specific position
    public Node del_given_pos(int pos){
        if(pos<1){
            System.out.println("Invalid");
            return null;
        }
        Node temp = head;
        int c=1;
        while(c<pos-1){
            temp=temp.next;
            c++;
        }
        temp.next=temp.next.next;
        return head;
    }
    //delete before given position
    public Node del_before_given_pos(int pos) {
        if (pos < 1) {
            System.out.println("Invalid");
            return null;
        }
        Node temp = head;
        int c = 1;
        while (c < pos - 2 && temp.next.next!= null) {
            temp = temp.next;
            c++;
        }
        temp.next = temp.next.next;
        return head;
    }

    //delete after given postion
    public Node del_after_given_pos(int pos) {
        if (pos < 1) {
            System.out.println("Invalid");
            return null;
        }
        Node temp = head;
        int c = 1;
        while (c < pos && temp.next.next != null) {
            temp = temp.next;
            c++;
        }
        temp.next = temp.next.next;
        return head;
    }
    //Method to print linked list
    public void print(){
        Node temp = head;
        int pos=1;
        while(temp!=null){
            System.out.println("Element at position "+ pos + " is " + temp.data);
            pos++;
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Singly_LL list = new Singly_LL();
        list.head=list.insert_at_head(1);
        list.head=list.insert_at_end(10);
        list.head=list.insert_at_end(20);
        list.head=list.insert_at_given_pos(34,2);
        //list.head=list.insert_before_pos(55,3);    //element is printing at given position . error
        //list.head=list.insert_at_given_pos(4,5);
        list.head=list.insert_after_pos(8,3);
        //list.head=list.del_head();
        //list.head=list.del_end();
        //list.head=list.del_after_given_pos(3);
        list.head=list.del_before_given_pos(3);
        list.print();
    }
}


