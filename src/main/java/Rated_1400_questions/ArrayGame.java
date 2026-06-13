package Rated_1400_questions;

import java.util.*;
public class ArrayGame {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();

            long[] nums = new long[n];
            for(int i=0;i<n;i++){
                nums[i] = sc.nextLong();
            }

            if(k>=3){
                System.out.println(0);
            } else {
                List<Long> ls = new ArrayList<>();
                int m = n*(n-1)/2;
                for(int i=0;i<n;i++){
                    for(int j=i+1;j<n;j++){
                        ls.add(Math.abs(nums[i] - nums[j]));
                    }
                }
                Collections.sort(ls);
                long ans = Long.MAX_VALUE;
                for (int i = 0; i < n; i++) ans = Math.min(ans, nums[i]);
                ans = Math.min(ans, ls.getFirst());
                if (k == 2) {
                    for (int i = 0; i < n; i++) {
                        long val = nums[i];
                        int at = lowerBound(ls, val); // first d >= ai
                        if (at < m) ans = Math.min(ans, Math.abs(ls.get(at) - val));
                        if (at - 1 >= 0) ans = Math.min(ans, Math.abs(ls.get(at-1) - val));
                    }
                }
                System.out.println(ans);
            }
        }
    }

    static int lowerBound(List<Long> a, long key) {
        int l = 0, r = a.size();
        while (l < r) {
            int m = (l + r) >>> 1;
            if (a.get(m) < key) l = m + 1;
            else r = m;
        }
        return l;
    }

}
