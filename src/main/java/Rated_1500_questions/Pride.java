package Rated_1500_questions;

import java.util.*;
public class Pride {

    static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return Math.abs(a);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        int ones = 0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextLong();
            if(a[i] == 1){
                ones ++;
            }
        }
        if(ones >= 1){
            System.out.println(n-ones);
        } else{
            int minLen = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                long g = 0;
                for(int j= i;j<n;j++){
                    g = gcd(g, a[j]);
                    if(g == 1){
                        minLen = Math.min(minLen, j-i+1);
                        break;
                    }
                }
            }
            if(minLen == Integer.MAX_VALUE){
                System.out.println(-1);
            } else{
                System.out.println((minLen-1)+(n-1));
            }
        }

    }

}
