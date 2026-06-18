package Rated_1500_questions;

import java.util.*;
public class BlockSequence {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }

            int[] dp = new int[n];
            Arrays.fill(dp, -1);

            System.out.println(fun(0, dp, a, n));
        }
    }

    public static int fun(int i, int[] dp, int[] a, int n){
        if(i >= n) return 0;
        if(dp[i] != -1) return dp[i];

        int ans = 1 + fun(i+1, dp, a, n);

        if(i  + a[i] < n){
            ans = Math.min(ans, fun(i+a[i] + 1, dp, a, n));
        }

        return dp[i] = ans;
    }

}
