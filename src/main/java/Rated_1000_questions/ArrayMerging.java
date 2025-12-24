package Rated_1000_questions;

import java.util.*;
public class ArrayMerging {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            int ans = 0;
            int streak = 1;
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
            }
            for(int j=0;j<n;j++){
                b[j] = sc.nextLong();
            }
            HashMap<Long, Integer> freqA = new HashMap<>();
            HashMap<Long, Integer> freqB = new HashMap<>();

            for(int i=1;i<a.length;i++){
                if(a[i-1] == a[i]){
                    streak++;
                } else{
                    freqA.put(a[i-1], Math.max(freqA.getOrDefault(a[i-1], 0), streak));
                    streak = 1;
                }
            }
            freqA.put(a[n-1], Math.max(freqA.getOrDefault(a[n-1], 0), streak));

            streak = 1;
            for(int i=1;i<b.length;i++){
                if(b[i-1] == b[i]){
                    streak++;
                } else{
                    freqB.put(b[i-1], Math.max(freqB.getOrDefault(b[i-1], 0), streak));
                    streak = 1;
                }
            }
            freqB.put(b[n-1], Math.max(freqB.getOrDefault(b[n-1], 0), streak));

            for(long x : freqA.keySet()){
                ans = Math.max(ans, freqA.get(x) + freqB.getOrDefault(x, 0));
            }
            for(long x : freqB.keySet()){
                ans = Math.max(ans, freqA.getOrDefault(x, 0) + freqB.get(x));
            }

            System.out.println(ans);
        }
    }
}
