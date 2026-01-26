package Rated_1100_questions;

import java.util.Scanner;

public class DejaVu {

    public static void main(String args[]){
        Scanner fs = new Scanner(System.in);

        int t = fs.nextInt();
        while(t-->0){
            int n = fs.nextInt();
            int q = fs.nextInt();
            long[] a = new long[n];
            long[] x = new long[q];

            for(int i=0;i<n;i++){
                a[i] = fs.nextLong();
            }

            for(int i=0;i<q;i++){
                x[i] = fs.nextLong();
            }

            long prev = 31;
            for(int i=0;i<q;i++){
                if(x[i]>=prev) continue;

                long val = (long) Math.pow(2, x[i]);
                for(int j=0;j<n;j++){
                    if(a[j]%val == 0){
                        a[j] += (val/2);
                    }
                }

                prev = x[i];
            }

            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }

}
