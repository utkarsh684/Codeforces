package Rated_1300_questions;

import java.util.*;
public class Shuffle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long x = sc.nextLong();
            long m = sc.nextLong();


            long p1 = x;
            long p2 = x;
            for(long i = 1;i<=m;i++){
                long l = sc.nextLong();
                long r = sc.nextLong();

                if (r >= p1 && l <= p2) {
                    p1 = Math.min(p1, l);
                    p2 = Math.max(p2, r);
                }
            }
            System.out.println(p2-p1+1);
        }

    }
}
