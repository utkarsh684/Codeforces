package Rated_1300_questions;

import java.util.*;
public class FindTheDifferentOnes {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
            }

            int[] pre = new int[n];
            Arrays.fill(pre, -1);

            for(int i=1;i<n;i++){
                if(arr[i] != arr[i-1]){
                    pre[i] = i-1;
                } else{
                    pre[i] = pre[i-1];
                }
            }
            int q = sc.nextInt();
            while(q-->0){
                int l = sc.nextInt();
                int r = sc.nextInt();

                if(pre[r-1] >= l-1){
                    System.out.println(r + " " + (pre[r - 1] + 1));
                } else{
                    System.out.println("-1 -1");
                }
            }
        }
    }

}
