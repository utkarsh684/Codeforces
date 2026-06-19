package Rated_1500_questions;

import java.util.*;
public class ZeroQuantityMaximization {

    private static final class Pair {
        final long p;
        final long q;
        Pair(long p, long q){
            this.p = p;
            this.q = q;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Pair)) return false;
            Pair other = (Pair) o;
            return p == other.p && q == other.q;
        }

        @Override
        public int hashCode() {
            return Objects.hash(p, q);
        }
    }

    public static long gcd(long a, long b){
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextLong();
        }
        long[] b = new long[n];
        for(int i =0;i<n;i++){
            b[i] = sc.nextLong();
        }
        int ans = 0;
        Map<Pair, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if (a[i] == 0) {
                if (b[i] == 0) ans++;
                continue;
            }
            long p = -b[i];
            long q = a[i];
            long g = gcd(p, q);
            p /= g;
            q /= g;
            if(q<0){
                p = -p;
                q = -q;
            }
            Pair key = new Pair(p,q);
            map.put(key, map.getOrDefault(key, 0) +1);
        }
        int max = 0;
        for (int count : map.values()) max = Math.max(max, count);
        ans += max;
        System.out.println(ans);
    }

}
