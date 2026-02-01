package Rated_1100_questions;

import java.io.IOException;
import java.util.*;
public class LiHuaPattern {

    public static void main(String args[]) throws IOException {
        FastScanner sc = new FastScanner();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[][] a = new long[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    a[i][j] = sc.nextLong();
                }
            }

            long cnt = 0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(a[i][j] != a[n-i-1][n-j-1]){
                        cnt++;
                    }
                }
            }
            cnt = cnt/2;

            if(k>cnt){
                System.out.println("NO");
            } else{
                long temp = cnt-k;
                if(temp%2==0){
                    System.out.println("YES");
                } else{
                    if(n%2==0){
                        System.out.println("NO");
                    } else{
                        System.out.println("YES");
                    }
                }
            }
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
