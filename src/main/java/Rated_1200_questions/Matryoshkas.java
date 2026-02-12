package Rated_1200_questions;

import java.util.*;
public class Matryoshkas {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
            }

            Map<Long, Integer> map = new HashMap<>();

            for(int i=0;i<n;i++){
                map.put(a[i], map.getOrDefault(a[i], 0)+1);
            }

            int ans =0;
            for(Map.Entry<Long, Integer> entry : map.entrySet()){
                long val = entry.getKey();
                int freq = entry.getValue();

                ans += Math.max(0, freq - map.getOrDefault(val - 1, 0));
            }

            System.out.println(ans);
        }
    }

}
