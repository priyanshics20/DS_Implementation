package Linked_List;

public class Singly_Linked_list {
    Node head;

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    //insert at head
    public Node insert_at_head(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            newNode.next = null;
            return head;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }
    // insert at end
    public Node insert_at_end(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            newNode.next = null;
            return head;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next=newNode;
        newNode.next=null;
        return head;
    }

    //insert at a given position
    public Node Insert_a_node_at_specific_position(int data, int pos){
        Node newnode = new Node(data);
        if(pos<1) {
            System.out.println("Invalid position");
            return null;
        }
        if(pos==1){
            newnode.next=head;
            head=newnode;
            return head;
        }
        Node h1 = head;
        int count=1;
        while(count<pos-1){
            h1=h1.next;
            count++;
        }
        newnode.next=h1.next;
        h1.next=newnode;
        return head;
    }
    //insert before a given position
    public Node insert_before_position(int data,int pos){
        Node newnode = new Node(data);
        if(pos<1) {
            System.out.println("Invalid position");
            return null;
        }
        int c=1;
        Node temp= head;
        while(c<pos-2){
            temp=temp.next;
            c++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        return head;
    }
    //insert after a given position
    public Node insert_after_pos(int data , int pos){
        Node newnode=new Node(data);
        if(pos<1){
            System.out.println("Invalid position");
            return null;
        }
        Node temp = head;
        int c=1;
        while(c<pos){
            c++;
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next=newnode;
        return head;
    }

    //delete head
    public Node del_head(){
        Node temp = head;
        if(head==null) {
            System.out.println("Invalid action, ll is empty.");
            return null;
        }
        if(head.next==null)
            return head.next;
        temp=temp.next;
        return temp;
    }

    // Delete at end
    public Node del_end(){
        Node temp = head;
        if(head==null) {
            System.out.println("Invalid action, ll is empty.");
            return null;
        }
        while(temp.next.next!= null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    // delete at specific position
    public Node del_given_pos(int pos){
        if(pos<1){
            System.out.println("Invalid action");
        }
        if(pos == 1 ) return null;
        int c=1;
        Node temp = head;
        while (c<pos-1){
            temp=temp.next;
            c++;
        }
        temp.next=temp.next.next;
        return head;
    }
    // delete node before a given position
    public Node del_before_pos(int pos){
        Node temp = head;
        int c=1;
        while(c<pos-2 && temp.next.next!=null){
            temp = temp.next;
            c++;
        }
        temp.next=temp.next.next;
        return head;
    }

    //delete node after a given position
    public Node del_after_pos(int pos){
        Node temp = head;
        int c=1;
        while(c<pos && temp.next.next!=null){
            temp = temp.next;
            c++;
        }
        temp.next = temp.next.next;
        return head;
    }

    //print method
    public void printAll(){
        Node temp = head;
        int pos = 1;
        while(temp!=null) {
            System.out.println("Node at position " + pos + " is " + temp.data);
            pos++;
            temp = temp.next;
        }
    }

    //count Nodes
    public void countNode(){
        int c=0;
        Node temp = head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        System.out.println("Total number of nodes "+ c);
    }

    public static void main(String[] args) {
        Singly_Linked_list llist = new Singly_Linked_list();
        llist.head=new Node(1);
        llist.head=llist.insert_at_head(55);
        llist.head =llist.insert_at_head(45);
        llist.Insert_a_node_at_specific_position(8,2);
        llist.head=llist.insert_at_end(7);
        llist.head=llist.insert_at_end(5);
        llist.insert_before_position(88,3);
        llist.insert_after_pos(99,5);
        //llist.head=llist.del_head();
        //llist.head=llist.del_end();
//      llist.head=llist.del_given_pos(6);
        //llist.head=llist.del_before_pos(6);
        llist.head=llist.del_after_pos(6);
        llist.printAll();
        llist.countNode();
    }
}