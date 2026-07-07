package Rated_1400_questions;

import java.util.*;
public class BasketBallExercise {

    static int n;
    static long[] h1 ;
    static long[] h2 ;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        h1 = new long[n];
        h2 = new long[n];
        for(int i=0;i<n;i++) h1[i] = sc.nextInt();
        for(int i=0;i<n;i++) h2[i] = sc.nextInt();

        long[] dp1 = new long[n];
        long[] dp2 = new long[n];

        dp1[0] = h1[0];
        dp2[0] = h2[0];

        for (int i = 1; i < n; i++) {
            dp1[i] = Math.max(dp1[i - 1], dp2[i - 1] + h1[i]);
            dp2[i] = Math.max(dp2[i - 1], dp1[i - 1] + h2[i]);
        }

        System.out.println(Math.max(dp1[n - 1], dp2[n - 1]));
    }

}
