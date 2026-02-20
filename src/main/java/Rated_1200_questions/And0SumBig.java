package Rated_1200_questions;

import java.util.Scanner;

public class And0SumBig{

    private static final long mod = 1000000007;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            long ans = 1;
            for(int i=0;i<k;i++){
                ans = (ans*n)%mod;
            }

            System.out.println(ans);
        }
    }
}