package Rated_1100_questions;

import java.util.*;
public class PaintTheArray {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
            }

            long gcd1 = 0;
            long gcd2 = 0;

            for(int i=0;i<n;i++){
                if(i%2==0){
                    gcd1 = gcd(gcd1, a[i]);
                } else{
                    gcd2 = gcd(gcd2, a[i]);
                }
            }

            boolean flag = true;
            for(int i=1;i<n;i+=2){
                if(a[i]%gcd1==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(gcd1);
                continue;
            }

            flag = true;
            for(int i=0;i<n;i+=2){
                if(a[i]%gcd2==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(gcd2);
            } else{
                System.out.println(0);
            }

        }
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
