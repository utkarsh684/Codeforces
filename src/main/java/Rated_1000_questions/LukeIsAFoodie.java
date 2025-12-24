package Rated_1000_questions;

import java.util.*;
public class LukeIsAFoodie {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long x = sc.nextLong();
            long[] nums = new long[n];
            for(int i=0;i<n;i++){
                nums[i] = sc.nextLong();
            }
            ArrayList<long[]> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(new long[]{nums[i]-x, nums[i]+x});
            }

            long ans = 0;
            long prev_start = list.get(0)[0];
            long prev_end = list.get(0)[1];
            for(int i=1;i<n;i++){
                long curr_start = list.get(i)[0];
                long curr_end = list.get(i)[1];

                long start = Math.max(prev_start, curr_start);
                long end = Math.min(prev_end, curr_end);

                if (start > end) {
                    ans++;
                    prev_start = curr_start;
                    prev_end = curr_end;
                } else {
                    prev_start = start;
                    prev_end = end;
                }
            }
            System.out.println(ans);
        }
    }

}
