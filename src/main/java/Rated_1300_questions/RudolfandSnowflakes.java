package Rated_1300_questions;

import java.util.*;
public class RudolfandSnowflakes {

    static int MAX = 1_000_000;
    static boolean[] ans = new boolean[MAX+1];

    public static void main(String[] args){
        for(int i=2;i<=1000;i++){
            long x = i*i*i;
            long y = (x-1)/(i-1);

            while(y<=MAX){
                ans[(int)y] = true;
                x*=i;
                y = (x-1)/(i-1);
            }
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            System.out.println(ans[n] ? "YES": "NO");
        }
    }

}
