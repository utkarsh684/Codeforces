package Rated_1000_questions;

import java.util.*;
import java.io.*;
public class BuyingTorches {

    public static void main(String args[]) throws IOException {
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();
        while(t-->0){
            long x = fs.nextLong();
            long y = fs.nextLong();
            long k = fs.nextLong();

            long ans1 = ((y*k)+(2*x)-4+k)/(x-1);
            long ans2 = k;
            System.out.println(ans1+ans2-1);
        }
    }

    private static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }

}
