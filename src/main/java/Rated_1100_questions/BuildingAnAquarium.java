package Rated_1100_questions;

import java.util.*;
public class BuildingAnAquarium {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long x = sc.nextLong();
            long[] a = new long[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            long s = 1;
            long e = (long) 1e12;

            long ans = -1;
            while(s<=e){
                long mid = s+(e-s)/2;
                if(check(mid, a, x)){
                    ans = mid;
                    s = mid+1;
                } else{
                    e = mid-1;
                }
            }
            System.out.println(ans);
        }
    }

    public static boolean check(long mid, long[] a, long x){
        int n = a.length;
        long v = 0;
        for(int i=0;i<n;i++){
            if(a[i]<=mid){
                v += (mid - a[i]);
            }
        }
        return v<=x;
    }

}
