package Rated_1300_questions;

import java.util.*;

public class ArrayElimination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                for (int j = 0; j < 31; j++) {
                    if ((x & (1 << j)) != 0) {
                        map.put(j, map.getOrDefault(j, 0) + 1);
                    }
                }
            }
            int gcd = 0;
            boolean isGcdZero = true;
            for (int count : map.values()) {
                isGcdZero = false;
                if (gcd == 0) {
                    gcd = count;
                } else {
                    gcd = gcd(gcd, count);
                }
            }
            if (isGcdZero) {
                for (int i = 1; i <= n; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
                continue;
            }

            List<Integer> factors = new ArrayList<>();
            for (int i = 1; i * i <= gcd; i++) {
                if (gcd % i == 0) {
                    factors.add(i);
                    if (i != gcd / i)
                        factors.add(gcd / i);
                }
            }
            Collections.sort(factors);
            for (int factor : factors) {
                System.out.print(factor + " ");
            }
            System.out.println();
        }
    }
    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
