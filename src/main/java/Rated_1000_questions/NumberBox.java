package Rated_1000_questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class NumberBox {

    public static void main(String args[]) throws IOException {
        FastScanner fs = new FastScanner();

        int t = fs.nextInt();
        while(t-->0){
            int n = fs.nextInt();
            int m = fs.nextInt();

            long[][] nums = new long[n][m];

            int countOfNegatives = 0;
            long sum = 0L;
            long small = Long.MAX_VALUE;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    nums[i][j] = fs.nextLong();
                    sum += Math.abs(nums[i][j]);
                    if(nums[i][j]<0){
                        countOfNegatives++;
                    }
                    if(Math.abs(nums[i][j])<small) small = Math.abs(nums[i][j]);
                }
            }
            if(countOfNegatives%2==0){
                System.out.println(sum);
            } else{
                System.out.println(sum-(2*small));
            }
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
