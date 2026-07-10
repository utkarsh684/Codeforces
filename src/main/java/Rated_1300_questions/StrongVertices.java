package Rated_1300_questions;

import java.util.*;
public class StrongVertices {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int[] diff = new int[n];
            int maxDiff = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                b[i] = sc.nextInt();
                diff[i] = a[i] - b[i];
                maxDiff = Math.max(maxDiff, diff[i]);
            }
            List<Integer> ans = new ArrayList<>();
            for(int i=0;i<n;i++){
                if(a[i] - b[i] == maxDiff){
                    ans.add(i+1);
                }
            }
            System.out.println(ans.size());
            for (int i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
