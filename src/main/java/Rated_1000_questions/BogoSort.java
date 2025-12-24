package Rated_1000_questions;

import java.util.*;
public class BogoSort {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] nums= new long[n];
            for(int i=0;i<n;i++){
                nums[i] = sc.nextLong();
            }

            Arrays.sort(nums);
            reverse(nums);

            for(int i=0;i<nums.length;i++){
                System.out.print(nums[i]+" ");
            }
            System.out.println();
        }
    }
    static void reverse(long[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            long temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

}
