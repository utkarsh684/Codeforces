package Rated_1600_questions;

import java.util.*;

public class ArrayWalk {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int z = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            long[] pref = new long[n];
            pref[0] = a[0];
            for (int i = 1; i < n; i++) {
                pref[i] = pref[i - 1] + a[i];
            }
            long ans = 0;
            for (int left = 0; left <= z; left++) {
                int right = k - 2 * left;
                if (right < 0) continue;
                int bestPair = 0;
                int limit = Math.min(right+1, n-1);
                for (int i = 1; i <= limit; i++) {
                    bestPair = Math.max(bestPair,
                            a[i] + a[i - 1]);
                }
                long cur = pref[right] + (long)left * bestPair;
                ans = Math.max(ans, cur);
            }
            System.out.println(ans);
        }
    }
}