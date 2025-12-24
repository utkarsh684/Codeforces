package Rated_1000_questions;

import java.util.*;
public class DistinctSplit {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            long[] pre = new long[n+1];
            long[] suff = new long[n+1];
            Set<Character> set = new HashSet<>();

            for(int i=1;i<=n;i++){
                set.add(s.charAt(i-1));
                pre[i] = set.size();
            }

            set.clear();

            for(int i=n;i>=1;i--){
                set.add(s.charAt(i-1));
                suff[i] = set.size();
            }

            long ans = 0;
            for(int i=0;i<n;i++){
                ans = Math.max(ans, pre[i]+suff[i+1]);
            }

            System.out.println(ans);
        }
    }

}
