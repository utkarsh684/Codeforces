package Rated_1400_questions;

import java.util.*;
public class AnnaandtheValentineDayGift {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] nums = new int[n];
            int[] trailing = new int[n];
            int totalDigits = 0;
            for(int i=0;i<n;i++){
                nums[i] = sc.nextInt();
                while(nums[i] % 10 == 0){
                    trailing[i]++;
                    nums[i] /= 10;
                    totalDigits++;
                }

                while (nums[i] > 0) {
                    totalDigits++;
                    nums[i] /= 10;
                }
            }

            Arrays.sort(trailing);
            for (int i = n - 1; i >= 0; i -= 2) {
                totalDigits -= trailing[i];
            }

            if(totalDigits > m){
                System.out.println("Sasha");
            } else{
                System.out.println("Anna");
            }
        }
    }
}
