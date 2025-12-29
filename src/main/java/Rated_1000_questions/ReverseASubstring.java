package Rated_1000_questions;

import java.util.*;
import java.io.*;
public class ReverseASubstring {

    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();

        int n = fs.nextInt();
        String s = fs.next();

        int first = 0;
        int second = 0;
        boolean found = false;

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)>s.charAt(i+1)){
                first = i;
                second = i+1;
                found = true;
                break;
            }
        }

        if(found){
            System.out.println("YES");
            System.out.println((first+1)+" "+(second+1));
        } else{
            System.out.println("NO");
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
