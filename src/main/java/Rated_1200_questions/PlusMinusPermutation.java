package Rated_1200_questions;

import java.util.*;
public class PlusMinusPermutation {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int count1 = (n/x) - (n/lcm(x,y));
            int count2 = (n/y) - (n/lcm(x,y));

            long sum1 = (long) (n-(n-count1+1)+1) *(n+n-count1+1)/2;
            long sum2 = (long) count2 *(count2+1)/2;

            System.out.println(sum1-sum2);
        }
    }

    private static int lcm(int a, int b){
        return (a / gcd(a, b)) * b;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


}
