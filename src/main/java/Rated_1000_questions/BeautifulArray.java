package Rated_1000_questions;

import java.util.*;

public class BeautifulArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long b = sc.nextLong();
            long s = sc.nextLong();
            long minimum_s = k * b;
            long maximum_s = (k * b) + (k - 1) * n;
            if (s < minimum_s || s > maximum_s) {
                System.out.println("-1");
            } else {
                long[] ans = new long[(int) n];
                ans[0] = minimum_s;
                s -= minimum_s;
                for (int i = 0; i < n; i++) {
                    long add = Math.min(k - 1, s);
                    ans[i] += add;
                    s -= add;
                }
                for (long value : ans) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }
    }
}
