package Rated_1400_questions;

import java.util.*;
public class OracAndModels {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] nums = new int[n+1];
            for(int i=1;i<=n;i++){
                nums[i] = sc.nextInt();
            }
            int[] dp = new int[n+1];
            for(int i=0;i<=n;i++){
                dp[i] = 1;
            }
            int max = 1;
            for(int i=1;i<=n;i++){
                for(int multiple=2*i;
                    multiple<=n;
                    multiple+=i){
                    if(nums[i] < nums[multiple]){
                        if(dp[i]+1 > dp[multiple]){
                            dp[multiple] = dp[i]+1;
                        }
                    }
                }
                if(dp[i] > max){
                    max = dp[i];
                }
            }
            System.out.println(max);
        }
    }
}
