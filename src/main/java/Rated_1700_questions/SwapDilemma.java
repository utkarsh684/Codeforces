package Rated_1700_questions;

import java.util.*;
public class SwapDilemma {
    static int permParity(int[] p) {
        int n = p.length, ans = 0;
        int[] a = Arrays.copyOf(p, n);
        for (int i = 0; i < n; i++) {
            while (a[i] != i + 1) {
                int j = a[i] - 1;
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                ans ^= 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws Exception {
        Scanner fs = new Scanner(System.in);

        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();

            int[] b = new int[n];
            HashMap<Integer, Integer> pos = new HashMap<>(n * 2);

            for (int i = 0; i < n; i++) {
                int x = fs.nextInt();
                pos.put(x, i + 1);
            }

            boolean ok = true;
            for (int i = 0; i < n; i++) {
                int x = fs.nextInt();
                Integer mapped = pos.get(x);
                if (mapped == null) ok = false;
                else b[i] = mapped;
            }

            if (ok && (permParity(b) % 2 == 0)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
