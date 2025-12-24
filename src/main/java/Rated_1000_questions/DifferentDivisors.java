package Rated_1000_questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class DifferentDivisors {

    public static void main(String args[]) throws IOException {
        List<Long> list = new ArrayList<>();
        for(long i=2;i<=100000;i++){
            boolean isPrime = true;
            for(long j=2;j*j<=i;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                list.add(i);
            }
        }

        FastScanner fs = new FastScanner();
        int t = fs.nextInt();
        while(t-->0){
            long d = fs.nextLong();

            long p = -1;
            for(long prime : list){
                if(prime>=1+d){
                    p = prime;
                    break;
                }
            }
            long q = -1;
            for(long prime : list){
                if(prime>=p+d){
                    q = prime;
                    break;
                }
            }

            long ans = Math.min(p*p*p, p*q);
            System.out.println(ans);
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
