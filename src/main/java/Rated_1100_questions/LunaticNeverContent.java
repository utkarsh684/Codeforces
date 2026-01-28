package Rated_1100_questions;

import java.util.*;
public class LunaticNeverContent {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();

            long[] a = new long[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
            }

            long ans = 0;
            for(int i=0;i<n;i++){
                ans = gcd(ans, Math.abs(a[i] - a[n-i-1]));
            }
            System.out.println(ans);
        }
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


}
