/*
sort the given string according to their length and if string have same length then sort it according to lexicographical order
 */
package Practice_Qus;

import java.util.Scanner;

public class BubbleSort_Qus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j].length()> arr[j+1].length()){
                    String temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                else if (arr[j].length() == arr[j + 1].length()){
                    if (arr[j].compareTo(arr[j + 1])>0) {
                        String temp = arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}