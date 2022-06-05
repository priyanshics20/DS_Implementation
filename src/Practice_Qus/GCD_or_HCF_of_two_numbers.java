package Practice_Qus;

import java.util.Scanner;

public class GCD_or_HCF_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //Time complexity of this method is O(min(a,b)
        int res = Math.min(a,b);
        while(res>0){
            if(a%res==0 && b%res==0){
                break;
            }
            res--;
        }
        System.out.println("HCF of"+a+" and "+b+" is "+res);

        //--------------------------------------------------------
        // Another method whose time complexity is O(log(min(a,b)))

    }
}
