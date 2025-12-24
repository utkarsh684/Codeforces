package contest;

import java.io.*;
import java.util.*;
public class BlackslexAndNumberTheory {

    public static void main(String args[]) throws Exception{
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();

        while(t-->0){
            int n = fs.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = fs.nextLong();
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
