package Rated_1200_questions;

import java.util.*;

public class StableGroups{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long x = sc.nextLong();

        List<Long> nums = new ArrayList<>();

        for(int i=0;i<n;i++){
            nums.add(sc.nextLong());
        }

        Collections.sort(nums);
        List<Long> differences = new ArrayList<>();

        for(int i=0;i<n-1;i++){
            long diff = nums.get(i+1)-nums.get(i);

            if(diff > x) differences.add(diff);
        }

        Collections.sort(differences);
        long ans = differences.size()+1;

        for(long diff : differences){
            long temp = (diff+x-1)/x - 1;
            if(k>=temp){
                ans --;
                k -= temp;
            } else{
                break;
            }
        }

        System.out.println(ans);
    }
}