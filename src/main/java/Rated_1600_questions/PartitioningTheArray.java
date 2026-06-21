package Rated_1600_questions;

import java.util.*;
public class PartitioningTheArray {

    static List<Integer> divisors(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i != 0) continue;
            res.add(i);
            if (n / i != i) res.add(n / i);
        }
        return res;
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return Math.abs(a);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }

            List<Integer> div = divisors(n);
            int ans = 0;
            for(int k : div){
                int g = 0;
                for(int i=k; i<n; i++){
                    int diff = Math.abs(a[i] - a[i-k]);
                    g = gcd(g, diff);
                }
                if(g!=0){
                    ans += 1;
                }
            }
            System.out.println(ans);
        }
    }

}
