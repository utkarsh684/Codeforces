package Rated_1100_questions;

import java.util.*;
public class GCDPartition {

    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            long totalSum = 0;
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                totalSum += a[i];
            }
            long ans = 0;
            long sum = 0;
            for(int i=0;i<n-1;i++){
                sum += a[i];
                ans = Math.max(ans, gcd(totalSum-sum, sum));
            }
            System.out.println(ans);
        }
    }

}
