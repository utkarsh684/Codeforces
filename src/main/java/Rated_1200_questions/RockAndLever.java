package Rated_1200_questions;

import java.util.*;

public class RockAndLever {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            List<Integer> v = new ArrayList<>(n);

            for (int i = 0; i < n; i++) {
                v.add(scanner.nextInt());
            }
            long[] maxSetBit = new long[31];
            for (int i = 0; i < n; i++) {
                for (int bit = 30; bit >= 0; bit--) {
                    if ((v.get(i) & (1 << bit)) != 0) {
                        maxSetBit[bit]++;
                        break;
                    }
                }
            }

            long ans = 0;
            for (int i = 0; i < 31; i++) {
                ans += (maxSetBit[i] * (maxSetBit[i] - 1)) / 2;
            }
            System.out.println(ans);
        }
    }

}

