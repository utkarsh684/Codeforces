package Rated_1000_questions;

import java.util.*;
public class BasketBallTogether {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            long d = sc.nextLong();
            Long[] nums = new Long[n];
            for(int i=0;i<nums.length;i++){
                nums[i] = sc.nextLong();
            }

            Arrays.sort(nums, Collections.reverseOrder());
            int teams = 0;
            int find = 0;
            int bind = n-1;
            while(find<=bind){
                long t = d/nums[find] + 1;
                int elements = bind-find;
                if(t-1<=elements){
                    bind-=(t-1);
                    find++;
                    teams++;
                } else{
                    break;
                }
            }
        System.out.println(teams);
    }

}
