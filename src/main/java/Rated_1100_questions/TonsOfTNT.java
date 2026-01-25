package Rated_1100_questions;

import java.util.*;
public class TonsOfTNT {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();

            long[] nums = new long[n];
            for(int i=0;i<nums.length;i++){
                nums[i] = sc.nextLong();
            }
            long[] prefix = new long[n];
            prefix[0] = nums[0];
            for(int i=1;i<n;i++){
                prefix[i] = nums[i]+prefix[i-1];
            }

            List<Integer> div = findDivisors(n);
            long ans = 0;
            for(int k : div){
                int start = k-1;
                long max = prefix[start];
                long min = prefix[start];

                for(int i = start+k;i<n;i+=k){
                    long curr = prefix[i]-prefix[i-k];
                    max = Math.max(max, curr);
                    min = Math.min(min, curr);

                }
                ans = Math.max(ans, max-min);
            }

            System.out.println(ans);
        }
    }

    public static List<Integer> findDivisors(int n){
        List<Integer> small = new ArrayList<>();
        List<Integer> large = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i != n) {
                    small.add(i);
                }

                int other = n / i;
                if (other != i && other != n) {
                    large.add(other);
                }
            }
        }

        Collections.reverse(large);
        small.addAll(large);

        return small;
    }

}
