package Rated_1000_questions;

import java.util.*;
public class TrianglesOnARectangle {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long w = sc.nextLong();
            long h = sc.nextLong();
            long area = Long.MIN_VALUE;
            for(int i=0;i<4;i++){
                int k = sc.nextInt();
                long fr = 0;
                long lt = 0;
                for(int j=0;j<k;j++){
                    long num = sc.nextLong();
                    if(j == 0) fr = num;
                    if(j == k-1) lt = num;
                }

                long base = lt - fr;
                long height;
                if(i<=1){
                    height = h;
                } else{
                    height = w;
                }

                area = Math.max(area, base*height);
            }
            System.out.println(area);
        }
    }

}
