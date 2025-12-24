package Rated_1000_questions;

import java.util.*;
public class ShoeShuffling {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] nums = new long[n];
            long max_element = Long.MIN_VALUE;
            for(int i=0;i<n;i++){
                nums[i] = sc.nextLong();
            }

            boolean cannotBeShuffled = false;
            HashMap<Long, Integer> map = new HashMap<>();
            for(int i=0;i<nums.length;i++){
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            }

            for(Map.Entry<Long, Integer> entry : map.entrySet()){
                if(entry.getValue() == 1){
                    cannotBeShuffled = true;
                    break;
                }
            }

            if(cannotBeShuffled){
                System.out.println(-1);
            } else{
                int[] arr = new int[n];
                for(int i=0;i<n;i++){
                    arr[i] = i+1;
                }
                int l = 0;
                int r = 0;
                for(int i=1;i<n;i++){
                    if(nums[i]!=nums[i-1]){
                        shift(arr, l, r);
                        l=r=i;
                    } else{
                        r++;
                    }
                }
                shift(arr, l, r);
                for(int i=0;i<n;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
    private static void shift(int[] arr, int l, int r){
        int temp = arr[r];
        for (int i = r; i > l; i--) {
            arr[i] = arr[i - 1];
        }
        arr[l] = temp;
    }
}
