package Rated_1100_questions;

import java.util.*;
import java.io.*;
public class MaximumSum {

    public static void main(String args[]) throws IOException {
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();
        while(t-->0){
            int n = fs.nextInt();
            int k = fs.nextInt();

            long[] nums = new long[n];
            for(int i=0;i<n;i++){
                nums[i] = fs.nextLong();
            }

            Arrays.sort(nums);

            long[] prefix = new long[n];
            prefix[0] = nums[0];
            for(int i=1;i<n;i++){
                prefix[i] = nums[i] + prefix[i-1];
            }
            long ans = Long.MIN_VALUE;
            for(int i=0;i<=k;i++){
                int j = k-i;
                int left = 2*i;
                int right = (n-j-1);
                long curr = prefix[right] - (left == 0 ? 0 : prefix[left-1]);
                ans = Math.max(ans, curr);
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
