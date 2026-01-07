package Rated_1100_questions;

import java.io.*;
import java.util.Scanner;

public class Quests {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }

            for(int i=0;i<n;i++){
                b[i] = sc.nextInt();
            }

            long sum = 0;
            long ans = 0;
            long max = 0;
            long p = Math.min(n, k);
            for(int i=0;i<p;i++){
                sum += a[i];
                max = Math.max(max, b[i]);
                long temp = sum + (k-(i+1))*max;
                ans = Math.max(ans, temp);
            }

            System.out.println(ans);
        }
    }

}
