package Rated_1600_questions;

import java.util.*;
public class InterestingSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long x = sc.nextLong();
            if (n == x) {
                System.out.println(n);
                continue;
            }
            long ans = -1;
            for (int i = 0; i <= 61; i++) {
                long cleared = (n >> i) << i;
                if (cleared == x) {
                    long m = x | (1L << i);
                    if (m >= n) {
                        ans = m;
                    }
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
