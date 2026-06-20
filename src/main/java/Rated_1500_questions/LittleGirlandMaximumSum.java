package Rated_1500_questions;

import java.io.*;
import java.util.*;
public class LittleGirlandMaximumSum {
    private static final class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        FastScanner(InputStream is) {
            this.in = is;
        }

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c, s = 1, x = 0;
            do {
                c = read();
            } while (c <= 32);
            if (c == '-') {
                s = -1;
                c = read();
            }
            while (c > 32) {
                x = x * 10 + (c - '0');
                c = read();
            }
            return x * s;
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);

        int n = fs.nextInt();
        int q = fs.nextInt();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = fs.nextInt();

        long[] diff = new long[n + 1];
        for (int i = 0; i < q; i++) {
            int l = fs.nextInt() - 1;
            int r = fs.nextInt() - 1;
            diff[l]++;
            diff[r + 1]--;
        }
        for (int i = 1; i <= n; i++) diff[i] += diff[i - 1];

        long[] cnt = Arrays.copyOf(diff, n);

        Arrays.sort(a);
        Arrays.sort(cnt);

        long ans = 0;
        for (int i = 0; i < n; i++) ans += a[i] * cnt[i];

        System.out.println(ans);
    }
}


