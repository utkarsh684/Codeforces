package Rated_1600_questions;

import java.util.*;
public class SayNoToPalindrome {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        int[][] prefix = new int[6][n];
        String[] beautiful = {"abc", "acb", "bac", "cab", "bca", "cba"};
        for(int i=0;i<6;i++){
            for(int j=0;j<n;j++){
                if(j>0) prefix[i][j] = prefix[i][j-1];
                if(s.charAt(j) != beautiful[i].charAt(j%3)) prefix[i][j]++;
            }
        }
        while(m-->0){
            int l = sc.nextInt()-1;
            int r = sc.nextInt()-1;
            int best = r-l+1;
            for(int i=0;i<6;i++){
                int mismatches = prefix[i][r] - (l>0 ? prefix[i][l-1] : 0);
                if(mismatches < best) best = mismatches;
            }
            System.out.println(best);
        }
    }

}
