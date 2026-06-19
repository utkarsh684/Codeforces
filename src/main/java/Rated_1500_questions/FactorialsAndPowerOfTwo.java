package Rated_1500_questions;

import java.util.*;
public class FactorialsAndPowerOfTwo {

    static long LIMIT = 1_000_000_000_000L;
    static List<Long> nums2;
    static long n;
    static long ans;

    static void generateNumbers() {
        nums2 = new ArrayList<>();
        long fact = 1;
        for(int i = 1; i <= 14; i++){
            fact *= i;
            if(i >= 3) nums2.add(fact);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        generateNumbers();
        while(t-->0){
            n = sc.nextLong();
            ans = Long.MAX_VALUE;
            dfs(0,0,0);
            System.out.println(ans);
        }
    }

    static void dfs(int index, long sum, int cnt){
        if(sum > n) return;
        if(index == 12){
            long rem = n - sum;
            ans = Math.min(ans, cnt + Long.bitCount(rem));
            return;
        }
        dfs(index + 1, sum, cnt);
        dfs(index + 1, sum + nums2.get(index), cnt+1);
    }
}
