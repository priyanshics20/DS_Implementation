/*
Complexity is O(n^2)
 */
package Searching_Sorting;

import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<n-1 ; i++) {
            int smallest =i;
            for(int j=i+1;j<n;j++){
                if(arr[smallest]> arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        System.out.println("sorted array - ");
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}