package Rated_1400_questions;

import java.util.*;
public class MashmokhandACM {
    static long mod = 1000000007;
    static int n, k;
    static long[][] dp;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        dp = new long[k+1][n+1];
        for(int i=0;i<=k;i++){
            Arrays.fill(dp[i], -1);
        }
        long ans = 0;
        for(int ind = 1; ind<=n;ind++){
            ans = (ans+fun(1, ind))%mod;
        }
        System.out.println(ans);
    }
    public static long fun(int len, int ind){
        if(len == k){
            return 1;
        }
        if(dp[len][ind] != -1) return dp[len][ind];
        long ways = 0;
        for(int nxt = ind; nxt <= n; nxt += ind){
            ways = (ways+fun(len+1, nxt))%mod;
        }
        return dp[len][ind] = ways;
    }
}
