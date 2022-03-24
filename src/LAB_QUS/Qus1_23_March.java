package LAB_QUS;
import java.util.*;
public class Qus1_23_March {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //QUS_24_mach queue = new QUS_24_mach(n);
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(arr[i]);
        }
        Stack<Integer> stack = new Stack<>();
        int idx = k;
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
    }
}

