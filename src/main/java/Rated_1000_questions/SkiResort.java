package Rated_1000_questions;

import java.util.*;
public class SkiResort {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long q = sc.nextLong();
            long[] nums = new long[n];
            for(int i=0;i<n;i++){
                nums[i] = sc.nextLong();
            }
            long ans = 0L;
            long counter = 0L;
            boolean last = false;

            for(int i = 0;i<nums.length;i++) {
                long num = nums[i];
                if(num<=q){
                    counter++;
                } else{
                    if(counter>=k){
                        long diff = counter-k+1;
                        ans+=diff*(diff+1)/2;
                    }
                    counter = 0;
                }
            }
            if(counter>=k){
                long diff = counter-k+1;
                ans+=diff*(diff+1)/2;
            }
            System.out.println(ans);
        }
    }

}
