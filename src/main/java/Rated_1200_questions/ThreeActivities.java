package Rated_1200_questions;

import java.util.*;
public class ThreeActivities {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            long[] a = new long[n];
            long[] b = new long[n];
            long[] c = new long[n];

            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
            }
            for(int i=0;i<n;i++){
                b[i] = sc.nextLong();
            }
            for(int i=0;i<n;i++){
                c[i] = sc.nextLong();
            }

            Pair[] A = new Pair[n];
            Pair[] B = new Pair[n];
            Pair[] C = new Pair[n];

            for (int i = 0; i < n; i++) A[i] = new Pair(a[i], i);
            for (int i = 0; i < n; i++) B[i] = new Pair(b[i], i);
            for (int i = 0; i < n; i++) C[i] = new Pair(c[i], i);

            Arrays.sort(A, (p1, p2) -> Long.compare(p2.val, p1.val));
            Arrays.sort(B, (p1, p2) -> Long.compare(p2.val, p1.val));
            Arrays.sort(C, (p1, p2) -> Long.compare(p2.val, p1.val));

            long ans = 0L;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        if (A[i].idx != B[j].idx &&
                                B[j].idx != C[k].idx &&
                                A[i].idx != C[k].idx) {

                            ans = Math.max(ans,
                                    A[i].val + B[j].val + C[k].val);
                        }
                    }
                }
            }
            System.out.println(ans);
        }

    }

    public static class Pair{
        long val;
        int idx;

        Pair(long val, int idx){
            this.idx = idx;
            this.val = val;
        }
    }
}
