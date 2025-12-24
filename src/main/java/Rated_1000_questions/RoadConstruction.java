package Rated_1000_questions;

import java.util.*;
public class RoadConstruction {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            n--;
            int msb = (int) (Math.log(n)/Math.log(2));

            int num = (int) (Math.pow(2, msb) - 1);
            List<Integer> ls = new ArrayList<>();
            while(num>=0){
                ls.add(num);
                num--;
            }
            num = (int)(Math.pow(2, msb));

            while(num <= n){
                ls.add(num);
                num++;
            }

            for(int a : ls){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }

}
