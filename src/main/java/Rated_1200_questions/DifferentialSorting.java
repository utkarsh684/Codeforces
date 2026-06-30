package Rated_1200_questions;

import java.util.*;
public class DifferentialSorting {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
            }

            if(a[n-2] > a[n-1]){
                System.out.println("-1");
            } else if (a[n-1]>=0) {
                System.out.println(n-2);
                for(int i=1;i<=n-2;i++){
                    System.out.println(i + " " + (n - 1) + " " + n);
                }
            } else{
                if(isSorted(a)){
                    System.out.println("0");
                } else{
                    System.out.println("-1");
                }
            }
        }
    }
    private static boolean isSorted(long[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

}
