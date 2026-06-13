package Rated_1400_questions;

import java.util.*;
public class Tape {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] b = new int[n];
        for(int i=0;i<n;i++){
            b[i] = sc.nextInt();
        }

        int[] diff = new int[n-1];
        for(int i=0;i<n-1;i++){
            diff[i] = b[i+1] - b[i] -1;
        }
        Arrays.sort(diff);

        int ans= n;
        for(int i=0;i<n-k;i++){
            ans += diff[i];
        }
        System.out.println(ans);
    }

}
