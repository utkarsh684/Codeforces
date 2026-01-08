package Rated_1100_questions;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;
public class YarikAndArray {

    public static void main(String args[]) throws IOException {
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();
        while(t-->0){
            int n = fs.nextInt();
            long[] a = new long[n];
            for(int i=0;i<n;i++){
                a[i]=fs.nextInt();
            }

            int i = 0;
            int j = 0;
            long sum = 0;
            long ans = Long.MIN_VALUE;
            while(j<n){
                if(sum<0){
                    sum = 0;
                    i = j;
                }
                if(i<j){
                    if (((a[j] ^ a[j - 1]) & 1) == 1) {
                        sum += a[j];
                    } else{
                        sum = a[j];
                        i = j;
                    }
                } else{
                    sum = a[j];
                }

                ans = Math.max(ans, sum);
                j++;
            }

            System.out.println(ans);
        }
    }

    static class FastScanner {
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        private final InputStream in = System.in;

        private int readByte() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        long nextLong() throws IOException {
            int c;
            do {
                c = readByte();
            } while (c <= ' ');

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
    }

}
