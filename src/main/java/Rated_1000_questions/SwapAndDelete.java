package Rated_1000_questions;

import java.util.*;
public class SwapAndDelete {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            long ones = 0;
            long zeros = 0;
            for(char ch : s.toCharArray()){
                if(ch == '0'){
                    zeros++;
                } else{
                    ones++;
                }
            }
                long m = 0L;
                for(char ch2 : s.toCharArray()){
                    if(ch2 == '0'){
                        if(ones == 0){
                            break;
                        }
                        ones--;
                    } else{
                        if(zeros == 0){
                            break;
                        }
                        zeros--;
                    }
                    m++;
                }
                System.out.println(s.length()-m);
        }
    }

}
