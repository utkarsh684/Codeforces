import java.io.*;
import java.util.*;

public class ElectionsinSaransk {

    static final int MAX = 500000;
    static final long MOD = 1000000007L;
    static int[] spf = new int[MAX + 1];

    static void sieve() {
        for (int i = 1; i <= MAX; i++) spf[i] = i;

        for (int i = 2; i * i <= MAX; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j <= MAX; j += i) {
                    if (spf[j] == j)
                        spf[j] = i;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {

        sieve();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            st.nextToken();

            st = new StringTokenizer(br.readLine());

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {

                int x = Integer.parseInt(st.nextToken());

                while (x > 1) {
                    int p = spf[x];
                    int cnt = 0;

                    while (x % p == 0) {
                        cnt++;
                        x /= p;
                    }

                    map.put(p, map.getOrDefault(p, 0) + cnt);
                }
            }

            long res = 1;

            for (int cnt : map.values()) {
                res = (res * (cnt + 1)) % MOD;
            }

            ans.append(res).append('\n');
        }

        System.out.print(ans);
    }
}