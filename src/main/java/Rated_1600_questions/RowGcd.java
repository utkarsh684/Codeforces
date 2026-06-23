package Rated_1600_questions;

import java.util.*;
public class RowGcd {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        long[] a = new long[n];

        long g = 0;
        long min = Long.MAX_VALUE;

        for(int i=0;i<n;i++){
            a[i] = sc.nextLong();
            if(a[i] < min) min = a[i];
        }

        for(int i=0;i<n;i++){
            g=gcd(g,a[i] - min);
        }

        for(int i=0;i<m;i++){
            long x = sc.nextLong();
            System.out.println(gcd(x+min, g));
        }

    }

    static long gcd(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

}
