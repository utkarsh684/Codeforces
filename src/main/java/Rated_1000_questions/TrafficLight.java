package Rated_1000_questions;

import java.util.*;
public class TrafficLight {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            char ch = sc.next().charAt(0);
            String s = sc.next();
            s=s+s;
            n=n*2;
            int ans = Integer.MIN_VALUE;
            int indOfGreen = 0;
            for(int i=n-1;i>=0;i--){
                if(s.charAt(i) == 'g'){
                    indOfGreen = i;
                }

                if(s.charAt(i) == ch){
                    ans = Math.max(ans, indOfGreen-i);
                }
            }
            System.out.println(ans);
        }
    }

}
