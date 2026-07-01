package Rated_1200_questions;

import java.util.*;
public class DolceVita {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long x = sc.nextLong();
            long[] a = new long[n];
            for(int i=0;i<n;i++) a[i] = sc.nextLong();
            Arrays.sort(a);
            long[] pre = new long[n];

            pre[0] = a[0];
            for (int i = 1; i < n; i++) {
                pre[i] = pre[i - 1] + a[i];
            }

            long ans = 0;
            for(int i=0;i<n;i++){
                ans += binSearch(pre[i], i, x);
            }
            System.out.println(ans);
        }
    }

    static boolean pf(long val, int ind, long x, long mid) {
        return val + ((ind + 1) * (mid - 1)) <= x;
    }

    static long binSearch(long val, int ind, long x) {
        long low = 1, high = 1000000005;
        long ans = 0;

        while (low <= high) {
            long mid = (low + high) / 2;

            if (pf(val, ind, x, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

}
