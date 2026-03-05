package Rated_1300_questions;

import java.util.Scanner;

public class AverageSleepTime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        long sum = 0;

        for(int i=0;i<k;i++){
            sum += nums[i];
        }

        long totalSum = sum;

        int i = 0;
        int j = k;
        while(j<n){
            sum -= nums[i];
            sum += nums[j];
            totalSum += sum;
            i++;
            j++;
        }

        System.out.printf("%.6f\n", 1.0 * totalSum / (n - k + 1));

    }
}