package Rated_1000_questions;

import java.util.*;
public class MinimumLCM {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            if(n%2==0){
                System.out.println(n/2 +" "+ n/2);
            } else{
                long ans = find(n);
                System.out.println(ans+" "+(n-ans));
            }
        }
    }

    private static long find(long n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return n/i;
            }
        }
        return 1;
    }

}
