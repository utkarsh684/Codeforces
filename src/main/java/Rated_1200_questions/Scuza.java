package Rated_1200_questions;

import java.util.*;

public class Scuza {
    static int binSearch(long[] pmax, int n, int val) {
        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (pmax[mid] <= val) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();

            long[] steps = new long[n];
            long[] query = new long[q];
            for (int i = 0; i < n; i++) {
                steps[i] = sc.nextLong();
            }

            for (int i = 0; i < q; i++) {
                query[i] = sc.nextLong();
            }

            long[] pmax = new long[n];
            long[] psum = new long[n];
            pmax[0] = steps[0];
            psum[0] = steps[0];

            for (int i = 1; i < n; i++) {
                pmax[i] = Math.max(pmax[i - 1], steps[i]);
                psum[i] = psum[i - 1] + steps[i];
            }

            for (int i = 0; i < q; i++) {
                int val = (int) query[i];

                int ind = binSearch(pmax, n, val);

                if (ind == -1) {
                    System.out.print("0 ");
                } else {
                    System.out.print(psum[ind] + " ");
                }
            }

            System.out.println();
        }

    }

}

