package Rated_1500_questions;

import java.util.*;
public class ZeroArray {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextLong();
        }
        long max = 0L;
        long sum = 0L;
        for(int i=0;i<n;i++){
            sum += a[i];
            if(a[i] > max) max = a[i];
        }

        if ((sum & 1L) == 1L || max > sum - max) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

}
