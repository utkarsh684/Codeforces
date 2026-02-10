package Rated_1200_questions;

import java.util.*;
public class AssemblyViaMinimums {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();

            int size = (n*(n-1))/2;
            long[] b = new long[size];
            for(int i=0;i<size;i++){
                b[i] = sc.nextLong();
            }

            Arrays.sort(b);
            int x = n-1;
            int i=0;
            while(x>0){
                System.out.print(b[i]+" ");
                i+=x;
                x--;
            }
            System.out.println("1000000000");
        }
    }

}
