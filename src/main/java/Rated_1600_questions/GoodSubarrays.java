package Rated_1600_questions;

import java.util.*;
public class GoodSubarrays {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            String s = sc.next();
            int j=0;
            for(char ch : s.toCharArray()){
                a[j] = ch - '0' - 1;
                j++;
            }
            int[] pre = new int[n+1];
            pre[0] = 0;
            Map<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);
            for(int i = 1; i <= n; i++){
                pre[i] = pre[i-1] + a[i-1];
                map.put(pre[i], map.getOrDefault(pre[i], 0) + 1);
            }
            long ans = 0;
            for (int cnt : map.values()) {
                ans += (long) cnt * (cnt - 1) / 2;
            }
            System.out.println(ans);
        }
    }

}
