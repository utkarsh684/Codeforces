package Rated_1700_questions;

import java.util.*;
public class MaximumModuloEquality {
    static long[] tree;
    static long[] diff;
    static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return Math.abs(a);
    }
    static void build(int ind, int start, int end) {
        if (start == end) {
            tree[ind] = diff[start];
            return;
        }
        int mid = (start + end) / 2;
        build(2*ind+1, start, mid);
        build(2*ind+2, mid + 1, end);
        tree[ind] = gcd(tree[2*ind+1], tree[2*ind+2]);
    }
    static long query(int ind, int start, int end, int l, int r) {
        if (start > r || end < l)
            return 0;
        if (l <= start && end <= r)
            return tree[ind];
        int mid = (start + end) / 2;
        long left = query(2*ind+1, start, mid, l, r);
        long right = query(2*ind+2, mid + 1, end, l, r);
        return gcd(left, right);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int q = sc.nextInt();
            long[] a = new long[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
            }
            if (n == 1) {
                while (q-- > 0) {
                    sc.nextInt();
                    sc.nextInt();
                    System.out.print(0 + " ");
                }
                System.out.println();
                continue;
            }
            diff = new long[n-1];
            for (int i = 1; i < n; i++)
                diff[i - 1] = Math.abs(a[i] - a[i - 1]);
            tree = new long[4 * (n - 1)];
            build(0, 0, n - 2);
            while (q-- > 0) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                if (l == r) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(query(0, 0, n - 2, l - 1, r - 2) + " ");
                }
            }
            System.out.println();
        }
    }
}
