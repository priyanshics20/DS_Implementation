package Practice_Qus;

import java.util.HashMap;
import java.util.Scanner;

public class Print_all_the_duplicates_in_the_input_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character, Integer> hm = new HashMap<>();
        int c=0;
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(char i : hm.keySet()){
            if(hm.get(i)>1){
                System.out.println(i+"  "+ hm.get(i));
            }
        }
    }
}