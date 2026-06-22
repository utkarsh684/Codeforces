package Rated_1600_questions;

import java.util.*;
public class ToBecomeMax {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextInt();

            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }

            long ans = 0;
            for(int pos = 0; pos <= n-1; pos++){
                long low = a[pos];
                long high = a[pos] + k;
                while(low<=high){
                    long mid = low + (high-low)/2;
                    if(check(a, pos, mid, k)){
                        ans = Math.max(ans, mid);
                        low = mid + 1;
                    } else{
                        high = mid - 1;
                    }
                }
            }
            System.out.println(ans);
        }
    }
    static boolean check(int[] a, int pos, long target, long k) {
        long ops = 0;
        long need = target;
        for(int i = pos; i < a.length; i++) {
            if(a[i] >= need) {
                return ops <= k;
            }
            ops += need - a[i];
            if(ops > k) {
                return false;
            }
            need--;
            if(need == 0) {
                return true;
            }
        }
        return false;
    }
}
