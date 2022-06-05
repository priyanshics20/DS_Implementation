package Practice_Qus;

import java.util.Scanner;

public class GCD_or_HCF_of_two_numbers {

    //Method 3
    // more optimize method to find gcd
     int gcd(int a , int b){
        if(b==0) {
            return a;
        }
        else {
            return gcd(b,a % b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //---------------------------------------------------
                //Method 1
        //Time complexity of this method is O(min(a,b)
//        int res = Math.min(a,b);
//        while(res>0){
//            if(a%res==0 && b%res==0){
//                break;
//            }
//            res--;
//        }
//        System.out.println("HCF of"+a+" and "+b+" is "+res);

        //--------------------------------------------------------
            //Method 2
        // Another method whose time complexity is O(log(min(a,b)))
        //Eucliclean  Algorithm
//        while(a!=b){
//            if(a>b)
//                a=a-b;
//            else
//                b=b-a;
//        }
//        System.out.println("GCD of these two number is "+ a);

        //-----------------------------------------------------------

        GCD_or_HCF_of_two_numbers obj = new GCD_or_HCF_of_two_numbers();
        int ans=obj.gcd(a,b);
        System.out.println("GCD of these two number is "+ ans);

    }
}
