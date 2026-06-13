package Rated_1400_questions;

import java.util.*;
public class ScheduleManagement {

    public static boolean check(int n, int m, int mid, int[] a){
        long maxPossible = 0;
        for(int i=0;i<n;i++){
            if(mid < a[i]){
                maxPossible += mid;
            } else{
                maxPossible += a[i] + (mid - a[i])/2;
            }
        }
        return maxPossible >= m;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<m;i++){
                int temp = sc.nextInt();
                a[temp-1] ++;
            }

            int low = 0;
            int high = 2*m;
            while(low < high){
                int mid = (low+high)/2;
                if(check(n, m, mid, a)){
                    high = mid;
                } else{
                    low = mid+1;
                }
            }
            System.out.println(low);
        }
    }

}
