package Rated_1400_questions;

import java.util.*;
public class TheNumberOfProducts {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextLong();
        }
        long[][] dp = new long[n][2];
        for(long[] row : dp){
            Arrays.fill(row, -1);
        }

        long positive = 0;
        long negative = 0;

        for(int i=0;i<n;i++){
            positive += fun(i,0,arr, dp);
            negative += fun(i,1,arr, dp);
        }

        System.out.println(negative + " " + positive);

    }
    public static long fun(int ind, int parity, long[] arr, long[][] dp){
        if(ind == 0){
            if(arr[0] > 0){
                return parity == 0 ? 1 : 0;
            }else{
                return parity == 1 ? 1 : 0;
            }
        }
        if(dp[ind][parity] != -1){
            return dp[ind][parity];
        }
        long ans;
        if(arr[ind] > 0){

            if(parity == 0){
                ans = fun(ind-1,0,arr, dp) + 1;
            }else{
                ans = fun(ind-1,1,arr, dp);
            }
        }else{
            if(parity == 0){
                ans = fun(ind-1,1,arr, dp);
            }else{
                ans = fun(ind-1,0,arr, dp) + 1;
            }
        }
        return dp[ind][parity] = ans;
    }

}
