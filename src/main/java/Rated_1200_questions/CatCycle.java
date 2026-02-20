package Rated_1200_questions;

import java.util.*;
public class CatCycle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long k = sc.nextLong();

            long A = n;
            long B = 1;
            k--;

            if(n%2==0){
                System.out.println(k%n+1);
            } else{
                long mid = n/2;
                System.out.println((k+(k/mid))%n + 1);
            }
        }
    }
}