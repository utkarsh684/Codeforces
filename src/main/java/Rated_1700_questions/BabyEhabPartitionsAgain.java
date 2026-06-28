package Rated_1700_questions;

import java.util.*;
public class BabyEhabPartitionsAgain {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int totalSum = 0;
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
            totalSum += a[i];
        }

        if(totalSum%2 !=0){
            System.out.println(0);
        } else{
            int target = totalSum/2;
            int[][] dp = new int[n+1][target+1];
            for(int[] row : dp){
                Arrays.fill(row, -1);
            }
            if(solve(a, 0, target, dp)){
                int min = Integer.MAX_VALUE;
                int index = -1;
                for(int i = 0;i<n;i++){
                    int x = a[i];
                    int cnt = 0;
                    while(x%2 == 0){
                        x /= 2;
                        cnt++;
                    }
                    if(cnt < min){
                        min = cnt;
                        index = i;
                    }
                }
                System.out.println(1);
                System.out.println(index+1);
            } else{
                System.out.println(0);
            }
        }
    }

    public static boolean solve(int[] a, int i, int target, int[][] dp){
        if(target == 0){
            return true;
        }
        if(i == a.length){
            return false;
        }

        if(dp[i][target] != -1){
            return dp[i][target] == 1;
        }

        boolean ans = false;
        ans |= solve(a, i + 1, target, dp);
        if (target >= a[i])
            ans |= solve(a, i + 1, target - a[i], dp);

        dp[i][target] = ans ? 1 : 0;

        return ans;
    }

}
