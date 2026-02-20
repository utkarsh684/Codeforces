package Rated_1200_questions;

import java.util.Scanner;

public class BinaryDeque {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] nums = new int[n];
            int total = 0;

            for(int i = 0; i < n; i++){
                nums[i] = sc.nextInt();
                total += nums[i];
            }

            if(total < s){
                System.out.println(-1);
                continue;
            }

            if(total == s){
                System.out.println(0);
                continue;
            }

            int left = 0;
            int currSum = 0;
            int maxLen = -1;

            for(int right = 0; right < n; right++){
                currSum += nums[right];

                while(currSum > s){
                    currSum -= nums[left];
                    left++;
                }

                if(currSum == s){
                    maxLen = Math.max(maxLen, right - left + 1);
                }
            }

            System.out.println(n - maxLen);
        }
    }
}
