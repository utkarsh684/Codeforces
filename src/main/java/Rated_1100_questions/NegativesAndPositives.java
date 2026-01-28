package Rated_1100_questions;

import java.util.*;
public class NegativesAndPositives {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            long sum = 0L;
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
                sum += Math.abs(a[i]);
            }

            boolean isMoreThanOne = false;
            int noOfNegatives = 0;
            long min = Long.MAX_VALUE;
            for(int i=0;i<n;i++){
                long curr = Math.abs(a[i]);
                if(a[i] < 0) {
                    isMoreThanOne = true;
                    noOfNegatives++;
                }

                if(curr < min) min = curr;
            }

            if(isMoreThanOne){
                if(noOfNegatives%2==0){
                    System.out.println(sum);
                } else{
                    System.out.println(sum-(2*min));
                }
            } else{
                System.out.println(sum);
            }
        }
    }

}
