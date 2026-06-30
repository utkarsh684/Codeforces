package Rated_1100_questions;

import java.util.*;
public class KillDemodogs {
    private static final int MOD = 1000000007;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long ans = ((((n * (n + 1)) % MOD) * (4 * n - 1)) % MOD * 337) % MOD;
            System.out.println(ans);
        }
    }
}
