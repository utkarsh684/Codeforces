package Rated_1700_questions;

import java.util.*;
public class DontBlameMe {

    static final long MOD = 1000000007;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            long[] dp = new long[64];
            for(int i=0;i<n;i++){
                int x = sc.nextInt();
                long[] next = dp.clone();
                next[x] = (next[x]+1)%MOD;

                for(int mask=0;mask<64;mask++){
                    if(next[mask] == 0) continue;

                    int newMask = mask&x;
                    next[newMask] = (next[newMask] + dp[mask])%MOD;
                }
                dp = next;
            }

            long ans = 0;
            for(int mask=0; mask<64; mask++){
                if(Integer.bitCount(mask) == k){
                    ans = (ans + dp[mask])%MOD;
                }
            }
            System.out.println(ans);
        }
    }

}
