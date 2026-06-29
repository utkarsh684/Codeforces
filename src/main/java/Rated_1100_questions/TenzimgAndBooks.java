package Rated_1100_questions;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;
public class TenzimgAndBooks {

    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();

            List<Integer>[] prefix = new ArrayList[3];
            for(int i=0;i<3;i++){
                prefix[i] = new ArrayList<>();
                int s = 0;
                prefix[i].add(s);

                for(int j=0;j<n;j++){
                    int a = sc.nextInt();
                    if((s|a) != s){
                        s |= a;
                        prefix[i].add(s);
                    }
                }
            }
            boolean ans = false;
            for(int A : prefix[0]){
                for(int B : prefix[1]){
                    for(int C : prefix[2]){
                        if((A | B | C) == x){
                            ans = true;
                            break;
                        }
                    }
                    if (ans) break;
                }
                if (ans) break;
            }
            System.out.println(ans ? "YES" : "NO");
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