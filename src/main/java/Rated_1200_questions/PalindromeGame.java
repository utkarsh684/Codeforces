package Rated_1200_questions;

import java.util.*;
public class PalindromeGame {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int zeros = 0;
            for(char ch : s.toCharArray()){
                if(ch == '0') zeros++;
            }

            if(zeros%2==0 || zeros==1){
                System.out.println("BOB");
            } else{
                System.out.println("ALICE");
            }
        }
    }

}
