package contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FirstOrSecond {
    static Map<String, Long> memo;
    static long[] a;

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();
            a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = fs.nextLong();
            }

            memo = new HashMap<>();
            List<Integer> children = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                children.add(i);
            }

            System.out.println(maxX(children));
        }
        sc.close();
    }

    static long maxX(List<Integer> children) {
        if (children.size() == 1) {
            return 0;
        }

        String key = children.toString();
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        long result = Long.MIN_VALUE;

        List<Integer> newList1 = new ArrayList<>(children);
        int first = newList1.remove(0);
        result = Math.max(result, a[first] + maxX(newList1));

        if (children.size() >= 2) {
            List<Integer> newList2 = new ArrayList<>(children);
            int second = newList2.remove(1);
            result = Math.max(result, -a[second] + maxX(newList2));
        }

        memo.put(key, result);
        return result;
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