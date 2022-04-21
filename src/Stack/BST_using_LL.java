package Stack;

import java.util.Scanner;

public class BST_using_LL {
    static Node root;
    static class Node{
        int data;
        Node left , right;
        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){
        Node newnode = new Node(val);
        if(root == null) {
            root = newnode;
            return root;
        }
        if(val< root.data) {
            if (root.left == null)
                root.left = newnode;
            else
                insert(root.left, val);
        }
        if(val> root.data) {
            if (root.right == null)
                root.right = newnode;
            else
                insert(root.right, val);
        }
        return root;
    }

    public void printpreorder(Node root){
        Node r1 = root;
        if(r1!=null){
            System.out.print(r1.data+" ");
            printpreorder(r1.left);
            printpreorder(r1.right);
        }
    }

    public static boolean search(Node root , int val){
        boolean result;
        if(root == null)
            return false;
        if(root.data == val)
            return true;
        if(root.data>val)
            result = search(root.left,val);
        else
            result = search(root.right,val);
        return result;
    }

    public static void main(String[] args) {
        BST_using_LL obj =new  BST_using_LL();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            root = insert(root,num);
        }
        obj.printpreorder(root);
    }
}
