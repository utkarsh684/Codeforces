package Rated_1400_questions;

import java.util.*;
public class JohnnyandAnotherRatingDrop {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            System.out.println(2*n - Long.bitCount(n));
        }
    }

}

