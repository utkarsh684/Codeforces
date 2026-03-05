package Rated_1300_questions ;

import java.util.Scanner;

public class BuyingShovels {
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long k = sc.nextLong();

            long ans = n;
            for(long j = 1;j*j<=n;j++){
                if(n%j == 0){
                    long t1 = j;
                    long t2 = n/j;
                    if(t1 <= k){
                        ans = Math.min(ans, n/t1);
                    }
                    if(t2 <= k){
                        ans = Math.min(ans, n/t2);
                    }
                }
            }

            System.out.println(ans);
        }
    }

}