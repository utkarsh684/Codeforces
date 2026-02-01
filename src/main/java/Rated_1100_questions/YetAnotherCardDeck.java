package Rated_1100_questions;

import java.util.*;
public class YetAnotherCardDeck {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[51];

        for(int i=0;i<51;i++){
            a[i] = n+1;
        }

        for(int i=1;i<=n;i++){
            int x = sc.nextInt();
            if(a[x] == n+1){
                a[x] = i;
            }
        }

        while(q-->0){
            int color = sc.nextInt();
            int temp = a[color];

            for(int i=1;i<=50;i++){
                if(a[i] < temp){
                    a[i]++;
                }
            }

            a[color] = 1;

            System.out.print(temp+" ");
        }

        System.out.println();
    }

}
