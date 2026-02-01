package Rated_1100_questions;

import java.util.*;
public class FunWithEvenSubArray {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
            }

            int i = n-1;
            while(i>=0 && a[i] == a[n-1]){
                i--;
            }

            if(i == -1){
                System.out.println(0);
                continue;
            }
            int ans = 0;
            while(i>=0){
                i = i-(n-i-1);
                ans++;

                while (i >= 0 && a[i] == a[n - 1]) {
                    i--;
                }
            }
            System.out.println(ans);
        }
    }

}
