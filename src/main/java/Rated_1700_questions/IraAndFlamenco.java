package Rated_1700_questions;

import java.util.*;
public class IraAndFlamenco {

    static final long MOD = 1_000_000_007L;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for(int i=0;i<n;i++) {
                int x = sc.nextInt();
                map.put(x, map.getOrDefault(x, 0)+1);
            }
            int k = map.size();
            long[] pre = new long[k];
            long pro = 1;
            int[] level = new int[k];
            int i = 0;
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                level[i] = entry.getKey();
                pro = mul(pro, entry.getValue());
                pre[i] = pro;
                i++;
            }

            long ans = 0;
            for(int ind = 0; ind+m-1<k;ind++){
                int j = ind+m-1;
                if(level[j] - level[ind] >= m) continue;
                long val = pre[j];
                if (ind > 0) val = mul(val, inv(pre[ind - 1]));
                ans = add(ans, val);
            }
            System.out.println(ans);
        }
    }

    static long mul(long a, long b) {
        return (a % MOD) * (b % MOD) % MOD;
    }

    static long add(long a, long b) {
        return (a + b) % MOD;
    }

    static long modexp(long a, long e) {
        a %= MOD;
        long r = 1;
        while (e > 0) {
            if ((e & 1L) == 1L) r = mul(r, a);
            a = mul(a, a);
            e >>= 1;
        }
        return r;
    }

    static long inv(long a) {
        return modexp(a, MOD - 2);
    }

}
