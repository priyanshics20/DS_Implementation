package Practice_Qus;

import java.util.Scanner;

public class LCM_of_two_numbers {

    //------------------------------------
    //Efficient Solution
    //Time complexity O(log(min(a,b)))
    int gcd(int a , int b){
        if(b==0) {
            return a;
        }
        else {
            return gcd(b,a % b);
        }
    }

    int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //-----------------
        //Naive Solution
        //time complexity is O((a*b)-max(a,b))
//        int res = Math.max(a,b);
//        while(true){
//            if(res%a==0 && res%b==0){
//                System.out.println(res);
//                break;
//            }
//            res++;
//        }

        LCM_of_two_numbers obj = new LCM_of_two_numbers();
        int ans = obj.lcm(a,b);
        System.out.println(ans);
    }
}

