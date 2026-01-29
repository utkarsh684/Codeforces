package Rated_1100_questions;

import java.io.IOException;
import java.util.*;
public class EatingCandies {

    public static void main(String args[]) throws IOException {
        FastScanner sc = new FastScanner();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] w = new long[n];
            for(int i=0;i<n;i++){
                w[i] = sc.nextLong();
            }

            int l = 0, r = n - 1;
            long leftSum = 0, rightSum = 0;
            int ans = 0;

            while (l <= r) {
                if (leftSum <= rightSum) {
                    leftSum += w[l++];
                } else {
                    rightSum += w[r--];
                }

                if (leftSum == rightSum) {
                    ans = l + (n - r - 1);
                }
            }

            System.out.println(ans);
        }
    }

    private static final class FastScanner {
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int readByte() throws IOException {
            if (ptr >= len) {
                len = System.in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        long nextLong() throws IOException {
            int c;
            do {
                c = readByte();
            } while (c <= ' ' && c != -1);

            boolean neg = false;
            if (c == '-') {
                neg = true;
                c = readByte();
            }

            long val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = readByte();
            }

            return neg ? -val : val;
        }

        int nextInt() throws IOException {
            return (int) nextLong();
        }
        String next() throws IOException {
            int c;
            do {
                c = readByte();
            } while (c <= ' ' && c != -1);

            if (c == -1) return null;

            StringBuilder sb = new StringBuilder();
            while (c > ' ') {
                sb.append((char) c);
                c = readByte();
            }

            return sb.toString();
        }
    }

}
