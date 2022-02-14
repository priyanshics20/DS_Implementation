package Stack;

public class Stack_using_array {
    int top;
    int arr[];  // declaration

    public Stack_using_array(int size) {
        top = -1;
        arr = new int[size];
    }

    public boolean isEmpty() {
        if (top == -1)
            return true;
        return false;
    }

    public boolean isFull() {
        if (top == arr.length - 1)
            return true;
        return false;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("overflow");
        }
        arr[++top] = data;
    }

    public void pop() {
        if (isEmpty())
            System.out.println("Underflow");
        System.out.println("pop " + arr[top--]);
    }

    public void peek() {
        if (isEmpty())
            System.out.println("stack is empty ");
        System.out.println("peek element " + arr[top]);
    }

    public void printAll() {
        for (int i = top; i > -1; i--)
            System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        Stack_using_array stack = new Stack_using_array(4);
        stack.push(88);
        stack.push(77);
        stack.push(56);
        stack.peek();
        stack.printAll();
        stack.pop();
    }
}
