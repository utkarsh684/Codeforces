package Rated_1500_questions;

import java.util.*;
public class Controllers {

    private static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return Math.abs(a);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int c1 = 0;
        for(char ch : s.toCharArray()){
            if(ch == '+'){
                c1++;
            }
        }
        int c2 = n-c1;
        int q = sc.nextInt();
        while(q-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();

            if(c1 == c2){
                System.out.println("YES");
                continue;
            }
            if(a == b){
                System.out.println("NO");
                continue;
            }

            long g = gcd(a, b);
            long x = a/g;
            long y = b/g;

            if(Math.abs(c1-c2)%Math.abs(y-x) == 0 && (x+y) * (Math.abs(c1-c2))/(Math.abs(y-x)) <= n){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }

        }
    }

}
