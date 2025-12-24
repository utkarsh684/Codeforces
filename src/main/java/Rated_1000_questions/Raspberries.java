package Rated_1000_questions;

import java.util.*;

public class Raspberries {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] nums = new int[n];
            int ans = Integer.MAX_VALUE;
            int evens = 0;

            for(int i=0;i<nums.length;i++) {
                nums[i] = sc.nextInt();
                if (nums[i] % 2 == 0) {
                    evens++;
                }

                if(nums[i]%k==0){
                    ans = 0;
                }

                ans = Math.min(ans, k-nums[i]%k);
            }

            if (k == 4) {
                if (evens >= 2) {
                    ans = Math.min(ans, 0);
                } else if (evens == 1) {
                    ans = Math.min(ans, 1);
                } else if (evens == 0) {
                    ans = Math.min(ans, 2);
                }
            }
            System.out.println(ans);
        }
    }

}
