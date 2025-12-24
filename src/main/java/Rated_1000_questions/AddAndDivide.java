package Rated_1000_questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class AddAndDivide {

    public static void main(String args[]) throws IOException {
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();
        while(t-->0) {
            long a = fs.nextLong();
            long b = fs.nextLong();

            long limit = (a/2)+1;
            long ans = Long.MAX_VALUE;
            long temp = b;
            while (temp <= b+30) {
                if(temp == 1){
                    temp +=1;
                    continue;
                }
                long x = calculateAns(a, temp) + (temp-b);
                ans = Math.min(ans, x);
                temp += 1;
            }

            System.out.println(ans);
        }
    }

    public static long calculateAns(long a, long b){
        long steps = 0L;
        while(a!=0){
            a=a/b;
            steps++;
        }
        return steps;
    }

    static class FastScanner {
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
