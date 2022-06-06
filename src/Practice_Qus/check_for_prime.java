package Practice_Qus;

import java.util.Scanner;

public class check_for_prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        //-------------------------------
        // naive method
        boolean flag = false;
        if(n == 1|| n==0){
            System.out.println(n+" is not a prime number");
        }
//        else{
//            for (int i = 2; i < n; i++) {
//                if (n % i == 0) {
//                    System.out.println(n + " is not prime number");
//                    flag = true;
//                    break;
//                }
//            }
//            if (flag == false) {
//                System.out.println(n + " is prime number");
//            }
//        }

        //------------------------------------------------------
        //Efficient solution
//        else {
//            for (int i = 2; i * i <= n; i++) {
//                if (n % i == 0) {
//                    System.out.println(n + " is not prime number");
//                    flag = true;
//                    break;
//                }
//            }
//            if (flag==false)
//                System.out.println(n+" is prime number");
//        }


        //----------------------------------------------
        //more efficient method
        else if(n == 2|| n == 3){
            System.out.println(n+" is prime number");
        }
        else if(n%2 == 0 || n%3 == 0){
            System.out.println(n+" is not prime number");
        }
        else{
            for(int i=5;i*i<=n ; i += 6){
                if(n%i==0 || n%(i+2)==0) {
                    System.out.println(n + " is not prime number");
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.out.println(n+" is prime number");
            }
        }
    }
}
