package Rated_1600_questions;

import java.util.*;
public class KuroniandImpossibleCalculation {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        long ans = 1;
        if(n>m){
            System.out.println(0);
        } else{
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    int diff = Math.abs(a[i] - a[j])%m;
                    ans = (ans*diff)%m;
                }
            }
            System.out.println(ans);
        }
    }

}
