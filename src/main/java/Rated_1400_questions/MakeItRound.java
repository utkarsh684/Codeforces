package Rated_1400_questions;

import java.util.*;
public class MakeItRound {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long m = sc.nextLong();
            int cnt2 = 0, cnt5 = 0;
            long n0 = n;
            long k = 1;
            while (n>0 && n%2==0) {
                n /= 2;
                cnt2++;
            }
            while (n>0 && n%5==0) {
                n /= 5;
                cnt5++;
            }
            while (cnt2<cnt5 && k*2<=m) {
                cnt2++;
                k *= 2;
            }
            while (cnt5<cnt2 && k*5<=m) {
                cnt5++;
                k *= 5;
            }
            while(k*10<=m){
                k *= 10;
            }
            if(k == 1) {
                System.out.println(n0*m);
            } else{
                k *= m/k;
                System.out.println(k*n0);
            }
        }
    }

}
