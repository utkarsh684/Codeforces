package Rated_1400_questions;

import java.util.*;
public class BallInBerland {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();

            int[] count1 = new int[a];
            int[] count2 = new int[b];

            for(int i=0;i<k;i++){
                int boy = sc.nextInt();
                count1[boy-1]++;
            }
            for(int i=0;i<k;i++){
                int girl = sc.nextInt();
                count2[girl-1]++;
            }

            long ans = (long) k * (k - 1) / 2;

            for (int x : count1) ans -= (long) x * (x - 1) / 2;
            for (int x : count2) ans -= (long) x * (x - 1) / 2;

            System.out.println(ans);
        }
    }

}
