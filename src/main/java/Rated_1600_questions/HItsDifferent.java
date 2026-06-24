package Rated_1600_questions;

import java.util.*;
public class HItsDifferent {

    static long[] ans = new long[1000001];

    public static void main(String[] args){
        precompute();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            System.out.println(ans[n]);
        }
    }

    static void precompute(){
        long[][] dp = new long[1500][1500];
        int num = 1;
        for(int row = 1; num<=1000000; row++){
            for(int col = 1; col<=row && num<=1000000; col++){
                long v = (long) num * num;
                dp[row][col] = v;

                if(row>1){
                    dp[row][col] += dp[row-1][col];
                }
                if(row>1 && col>1){
                    dp[row][col] += dp[row-1][col-1];
                }
                if(row>2 && col>1){
                    dp[row][col] += dp[row-2][col-1];
                }
                ans[num] = dp[row][col];
                num++;
            }
        }
    }

}
