package Rated_1100_questions;

import java.util.*;
public class AndSorting {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int and = (1<<30)-1;
            for(int i=0;i<n;i++){
                int x = sc.nextInt();
                if(x != i){
                    and = and&x;
                }
            }
            System.out.println(and);
        }
    }

}
