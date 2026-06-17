package Rated_1400_questions;

import java.util.*;
public class ZeroRemainderArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            HashMap<Long, Long> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                long rem = x % k;
                if (rem != 0) {
                    map.put(rem, map.getOrDefault(rem, 0L) + 1);
                }
            }
            long max = 0;
            for (Map.Entry<Long, Long> e : map.entrySet()) {
                long rem = e.getKey();
                long freq = e.getValue();
                long moves = (freq - 1) * k + (k - rem);
                max = Math.max(max, moves);
            }
            if (max == 0) {
                System.out.println(0);
            } else {
                System.out.println(max + 1);
            }
        }
    }
}
