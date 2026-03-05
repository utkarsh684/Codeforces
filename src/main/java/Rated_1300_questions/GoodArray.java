package Rated_1300_questions;

import java.util.*;
public class GoodArray {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] freq = new int[1000001];
        long sum = 0;
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
            freq[nums[i]]++;
            sum += nums[i];
        }

        List<Integer> ls = new ArrayList<>();
        for(int i=0;i<n;i++){
            long newSum = sum - nums[i];
            freq[nums[i]]--;

            if(newSum%2==0 && (newSum/2)<=1000000 && freq[(int)newSum/2]>0){
                ls.add(i+1);
            }

            freq[nums[i]]++;
        }

        System.out.println(ls.size());
        for(int i : ls){
            System.out.print(i+" ");
        }
        System.out.println();
    }

}
