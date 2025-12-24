package Rated_1000_questions;

import java.util.*;
public class MEXorMixUp {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int xor = findXor(a-1);

            if(xor == b){
                System.out.println(a);
            } else if ((xor^a) == b) {
                System.out.println(a+2);
            } else{
                System.out.println(a+1);
            }
        }
    }

    private static int findXor(int n){
        int d = n%4;
        if(d==0){
            return n;
        } else if (d == 1) {
            return 1;
        } else if(d == 2){
            return n+1;
        } else{
            return 0;
        }
    }

}
