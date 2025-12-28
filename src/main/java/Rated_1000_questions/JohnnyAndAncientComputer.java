package Rated_1000_questions;

import java.util.*;
import java.io.*;
public class JohnnyAndAncientComputer {

    public static void main(String args[]) throws IOException{
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();
        while(t-->0){
            long a = fs.nextLong();
            long b = fs.nextLong();

            long odda = a;
            long oddb = b;

            while(odda%2==0){
                odda/=2;
            }
            while(oddb%2==0){
                oddb/=2;
            }

            if(odda != oddb){
                System.out.println(-1);
            } else{
                a/=odda;
                b/=oddb;

                a = (long) (Math.log(a)/Math.log(2));
                b = (long) (Math.log(b)/Math.log(2));

                long ans = (long) Math.ceil(Math.abs(a - b) / 3.0);
                System.out.println(ans);
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
