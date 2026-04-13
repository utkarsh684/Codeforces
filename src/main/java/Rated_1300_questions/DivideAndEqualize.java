package Rated_1300_questions;

import java.util.*;
public class DivideAndEqualize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            Map<Integer, Integer> mp = new HashMap<>();
            for (int i = 0; i < n; i++) {
                for (int j = 2; j * j <= a[i]; j++) {
                    while (a[i] % j == 0) {
                        mp.put(j, mp.getOrDefault(j, 0) + 1);
                        a[i] /= j;
                    }
                }
                if (a[i] > 1) {
                    mp.put(a[i], mp.getOrDefault(a[i], 0) + 1);
                }
            }

            boolean flag = true;
            for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
                if (entry.getValue() % n != 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}


