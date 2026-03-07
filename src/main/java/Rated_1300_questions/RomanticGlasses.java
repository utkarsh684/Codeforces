package Rated_1300_questions;

import java.util.*;
public class RomanticGlasses {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] nums = new long[n];
            for(int i=0;i<n;i++){
                nums[i] = sc.nextLong();
            }

            long[] prefixEven = new long[n];
            long[] prefixOdd = new long[n];

            prefixEven[0] = nums[0];
            int flag = 0;
            Map<Long, Integer> mp = new HashMap<>();
            mp.put(prefixOdd[0] - prefixEven[0], 1);

            for (int i = 1; i < n; i++) {
                prefixOdd[i] += prefixOdd[i - 1];
                prefixEven[i] += prefixEven[i - 1];
                if (i % 2 == 1) {
                    prefixOdd[i] += nums[i];
                } else {
                    prefixEven[i] += nums[i];
                }
                long diff = prefixOdd[i] - prefixEven[i];
                mp.put(diff, mp.getOrDefault(diff, 0) + 1);
                if (mp.get(diff) == 2 || diff == 0) {
                    flag = 1;
                    break;
                }
            }

            if(flag == 1){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }

}
