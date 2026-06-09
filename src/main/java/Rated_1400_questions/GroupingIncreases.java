package Rated_1400_questions;

import java.util.*;
public class GroupingIncreases {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] nums = new int[n];
            int x = Integer.MAX_VALUE;
            int y = Integer.MAX_VALUE;
            int ans = 0;
            for(int i=0;i<n;i++){
                nums[i] = sc.nextInt();

                if(x>y){
                    int temp = x;
                    x=y;
                    y = temp;
                }

                if(nums[i] <= x){
                    x = nums[i];
                } else if(nums[i] <= y){
                    y = nums[i];
                } else{
                    ans ++;
                    x = nums[i];
                }
            }
            System.out.println(ans);
        }
    }

}
