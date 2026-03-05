package Rated_1300_questions;

import java.util.*;
public class Omkar {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            boolean found = false;

            for(long i = 2;i*i <= n;i++){
                if(n%i == 0){
                    long fr = n/i;
                    long sec = n-i;
                    System.out.println(fr +" "+sec);
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println(1 + " " + (n - 1));
            }
        }
    }

}
