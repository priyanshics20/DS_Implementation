/*
Complexity is O(n^2)
 */
package Searching_Sorting;

import java.util.Scanner;

public class Bubble_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Unsorted array- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        for(int i=0;i<n;i++){
            boolean swapped = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped = true;
                }
            }
            if(swapped == false)
                break;
        }
        System.out.println();
        System.out.println("Sorted array- ");
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
}
