package Rated_1100_questions;

import java.util.*;
public class CoPRIME {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] lastSeen = new int[1001];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                lastSeen[a[i]] = i+1;
            }
            for(int i=0;i<=1000;i++){
                
            }
        }
    }

}
