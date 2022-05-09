package Searching_Sorting;

import java.util.Scanner;

public class BInary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter sorted elements in an array");
        for(int i =0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element ");
        int item = sc.nextInt();
        int l=0, h=arr.length-1;
        int mid = (l+h)/2;
        while((arr[mid]!=item)&&(l<=h)) {
            if (item > arr[mid])
                l = mid + 1;
            else
                h = mid - 1;
            mid = (l+h)/2;
        }
        if(arr[mid]==item){
            System.out.println("Element found at "+ mid);
        }
        else
            System.out.println("-1");
    }
}
