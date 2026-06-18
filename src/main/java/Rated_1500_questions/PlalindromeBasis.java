package Rated_1500_questions;

import java.util.*;
public class PlalindromeBasis {
    static final int MOD = 1000000007;
    static List<Integer> pal = new ArrayList<>();
    static {
        for(int i=1;i<=40000;i++){
            if(isPal(i)) pal.add(i);
        }
    }
    static final int MAX = 40000;
    static long[] prev = new long[MAX + 1];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        precompute();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            System.out.println(prev[n]);
        }
    }
    public static boolean isPal(int x){
        int rev = 0;
        int temp = x;
        while(temp > 0){
            rev = rev*10 + temp%10;
            temp /= 10;
        }
        return rev == x;
    }
    public static void precompute() {
        for(int amt = 0;amt<=MAX;amt++){
            if(amt% pal.get(0) == 0){
                prev[amt] = 1;
            }
        }
        for(int index = 1;index < pal.size();index++){
            long[] curr = new long[MAX+1];
            for(int amt = 0;amt<=MAX;amt++){
                long notTake = prev[amt];
                long take = 0;
                if(pal.get(index) <= amt){
                    take = curr[amt - pal.get(index)];
                }
                curr[amt] = (take+notTake)%MOD;
            }
            prev = curr;
        }
    }
}
