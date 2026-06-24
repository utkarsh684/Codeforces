package Rated_1600_questions;

import java.util.*;
public class AdvertisingAgency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                map.put(a[i], map.getOrDefault(a[i], 0)+1);
            }
            int[] b = Arrays.stream(a)
                    .boxed()
                    .sorted(Collections.reverseOrder())
                    .mapToInt(Integer::intValue)
                    .toArray();
            int x = b[k-1];
            int need = 0, total = 0;
            for(int i=0;i<n;i++){
                if(b[i] == x){
                    if(i<k){
                        need ++;
                    }
                    total++;
                }
            }
            System.out.println(nCr(total, need));
        }
    }
    static long MOD = 1_000_000_007L;
    static long power(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % MOD;
            }
            a = (a * a) % MOD;
            b >>= 1;
        }
        return res;
    }
    static long nCr(int n, int r) {
        if (r < 0 || r > n) return 0;
        long[] fact = new long[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }
        long den = (power(fact[r], MOD - 2) * power(fact[n - r], MOD - 2)) % MOD;
        return (fact[n] * den) % MOD;
    }
}
