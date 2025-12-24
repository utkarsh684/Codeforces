package contest;

import java.io.*;
import java.util.*;

public class BlackslexAndShowering {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = fs.nextInt();
            }

            long originalSum = 0;
            for (int i = 0; i < n - 1; i++) {
                originalSum += Math.abs(a[i] - a[i + 1]);
            }

            long ans = originalSum;

            ans = Math.min(ans, originalSum - Math.abs(a[0] - a[1]));

            ans = Math.min(ans, originalSum - Math.abs(a[n - 2] - a[n - 1]));

            for (int k = 1; k < n - 1; k++) {
                long cur = originalSum
                        - Math.abs(a[k - 1] - a[k])
                        - Math.abs(a[k] - a[k + 1])
                        + Math.abs(a[k - 1] - a[k + 1]);
                ans = Math.min(ans, cur);
            }

            System.out.println(ans);
        }
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
    }
}

