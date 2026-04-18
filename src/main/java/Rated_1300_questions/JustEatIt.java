package Rated_1300_questions;

import java.util.*;
public class JustEatIt {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            long sum = 0;
            long maxSubArraySum = 0;
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
                sum += a[i];
            }

            long currentSum = 0;
            for(int i=0;i<n-1; i++){
                currentSum += a[i];
                if(currentSum<0){
                    currentSum = 0;
                }
                maxSubArraySum = Math.max(maxSubArraySum, currentSum);
            }

            currentSum = 0;
            for(int i=1;i<n;i++){
                currentSum += a[i];
                if (currentSum<0){
                    currentSum = 0;
                }
                maxSubArraySum = Math.max(maxSubArraySum, currentSum);
            }

            if (maxSubArraySum >= sum) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }

}
