package Rated_1100_questions;

import java.util.*;
public class CountingOrders {

    private static final long MOD = 1000000007;

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];

            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);

            for(int i=0;i<n;i++){
                b[i] = sc.nextLong();
            }
            Arrays.sort(b);
            for (int i = 0; i < n / 2; i++) {
                long temp = b[i];
                b[i] = b[n - i - 1];
                b[n - i - 1] = temp;
            }

            long result = 1;
            for(int i=0;i<n;i++){
                int temp = upperBound(a, b[i]);
                int count = a.length-temp;
                result = result*Math.max(count-i,0)%MOD;
            }
            System.out.println(result);

        }
    }
    public static int upperBound(long[] arr, long target) {
        int low = 0;
        int high = arr.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
