package Rated_1500_questions;

import java.util.*;
public class KCompleteWord {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int blocks = n/k;
            int ans = 0;
            for(int i=0;i<(k+1)/2;i++){
                int[] freq = new int[26];
                for(int j=0;j<blocks;j++){
                    int idx1 = j*k + i;
                    int idx2 = (j+1)*k - i-1;
                    freq[s.charAt(idx1) - 'a']++;
                    if(idx1 != idx2) freq[s.charAt(idx2) - 'a']++;
                }
                int total = 0;
                int max = 0;
                for(int f : freq){
                    total += f;
                    if(f>max) max = f;
                }
                ans += total - max;
            }
            System.out.println(ans);
        }
    }

}
