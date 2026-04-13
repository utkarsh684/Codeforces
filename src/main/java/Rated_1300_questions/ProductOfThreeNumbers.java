package Rated_1300_questions;

import java.util.*;
public class ProductOfThreeNumbers {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long[] ans = solve(n);
            if(ans[0] == -1){
                System.out.println("NO");
            }else{
                System.out.println("YES");
                System.out.println(ans[0]+" "+ans[1]+" "+ans[2]);
            }
        }
    }

    static long[] solve(long n){
        long a = -1, b = -1, c = -1;
        for(long i = 2; i*i <= n; i++){
            if(n % i == 0){
                a = i;
                n /= i;
                break;
            }
        }
        for(long i = 2; i*i <= n; i++){
            if(n % i == 0 && i != a){
                b = i;
                c = n / i;
                break;
            }
        }
        if(a != -1 && b != -1 && c != -1 && a != b && b != c && a != c){
            return new long[]{a,b,c};
        }
        return new long[]{-1,-1,-1};
    }
}
