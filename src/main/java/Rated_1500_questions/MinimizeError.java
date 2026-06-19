package Rated_1500_questions;

import java.util.*;
public class MinimizeError {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k1 = sc.nextLong();
        long k2 = sc.nextLong();

        long[] a = new long[n];
        long[] b = new long[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextLong();
        }
        for(int i=0;i<n;i++){
            b[i] = sc.nextLong();
        }
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            pq.add(Math.abs(a[i]-b[i]));
        }
        long k = k1+k2;
        while(k>0){
            long x = pq.poll();
            if(x == 0) break;
            x--;
            pq.add(x);
            k--;
        }
        long ans = 0;
        while(!pq.isEmpty()){
            long x = pq.poll();
            ans += x*x;
        }
        if ((k & 1L) == 1L) ans++;
        System.out.println(ans);
    }

}
