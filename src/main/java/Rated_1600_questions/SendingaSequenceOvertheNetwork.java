package Rated_1600_questions;

import java.util.*;
public class SendingaSequenceOvertheNetwork {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean[] dp = new boolean[n+1];
            dp[0] = true;
            int[] b = new int[n];
            for(int i=0;i<n;i++){
                b[i] = sc.nextInt();
            }
            for(int i=1;i<=n;i++){
                int x = b[i-1];
                if(dp[i-1] && i+x<=n){
                    dp[x+i] = true;
                }
                if(i-x-1>=0 && dp[i-x-1]){
                    dp[i] = true;
                }
            }
            System.out.println(dp[n] ? "YES" : "NO");
        }
    }

}
