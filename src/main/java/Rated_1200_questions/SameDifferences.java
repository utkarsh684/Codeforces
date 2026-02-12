package Rated_1200_questions;

import java.util.*;
public class SameDifferences {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            Long[] a = new Long[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
            }

            for(int i=0;i<n;i++){
                a[i] -= i;
            }

            Map<Long, Long> map = new HashMap<>();
            for(int i=0;i<n;i++){
                map.put(a[i], map.getOrDefault(a[i], 0L)+1);
            }

            long ans = 0;
            for(Map.Entry<Long, Long> entry : map.entrySet()){
                long freq = entry.getValue();
                ans += ((freq)*(freq-1))/2;
            }

            System.out.println(ans);
        }
    }

}
