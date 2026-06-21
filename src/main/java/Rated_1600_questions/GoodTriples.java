package Rated_1600_questions;

import java.util.*;
public class GoodTriples {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] ways = new int[10];
        for(int i=0;i<=9;i++){
            for(int j=0;j<=9;j++){
                for(int k=0;k<=9;k++){
                    if(i+j+k < 10) ways[i+j+k]++;
                }
            }
        }
        int t = sc.nextInt();
        while(t-->0){
            String n = sc.next();
            long ans = 1;
            for(char ch : n.toCharArray()){
                int d = ch - '0';
                ans *= ways[d];
            }
            System.out.println(ans);
        }
    }
}
