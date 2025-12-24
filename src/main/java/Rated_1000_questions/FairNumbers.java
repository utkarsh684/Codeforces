package Rated_1000_questions;

import java.util.*;
public class FairNumbers {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();

            while(!isFair(n)){
                n += 1;
            }

            System.out.println(n);
        }
    }

    private static boolean isFair(long n) {
        long num = n;
        while (num != 0) {
            int x = (int) (num % 10);
            if (x != 0 && n % x != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

}
