package Rated_1700_questions;

import java.util.*;
public class RunningMiles {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] b = new int[n];
            for(int i=0;i<n;i++){
                b[i] = sc.nextInt();
            }
            int[] dp1 = new int[n+1];
            int[] dp2 = new int[n+1];
            int[] dp3 = new int[n+1];
            dp1[0] = dp2[0] = dp3[0] = Integer.MIN_VALUE;
            for(int i=1;i<=n;i++){
                dp1[i] = Math.max(dp1[i-1], b[i-1]+i);
            }
            for(int i=2;i<=n;i++){
                dp2[i] = Math.max(dp2[i-1], dp1[i-1]+b[i-1]);
            }
            for(int i=3;i<=n;i++){
                dp3[i] = Math.max(dp3[i-1], dp2[i-1]+b[i-1]-i);
            }
            System.out.println(dp3[n]);
        }
    }

}
