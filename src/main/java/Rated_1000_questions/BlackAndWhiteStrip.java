package Rated_1000_questions;

import java.util.*;
public class BlackAndWhiteStrip {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            long[] pre = new long[n+1];
            for(int i=0;i<n;i++){
                pre[i+1] = pre[i] + (s.charAt(i) == 'W' ? 1:0);
            }

            long ans = Long.MAX_VALUE;
            for(int i=0;i<=n-k;i++){
                long diff = pre[i+k] - pre[i];
                ans = Math.min(ans, diff);
            }

            System.out.println(ans);
        }
    }

}
