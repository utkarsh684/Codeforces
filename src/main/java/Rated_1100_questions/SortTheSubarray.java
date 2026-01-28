package Rated_1100_questions;

import java.util.*;
public class SortTheSubarray {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }

            for(int i=0;i<n;i++){
                b[i] = sc.nextInt();
            }

            int l = -1;
            int r = -1;
            for(int i=0;i<n;i++){
                if(a[i] != b[i]){
                    l=i;
                    break;
                }
            }

            for(int i=n-1;i>=0;i--){
                if(a[i] != b[i]){
                    r= i;
                    break;
                }
            }

            int l2 = l;
            for(int i=l2;i>0;i--){
                if(b[i-1] <= b[i] ){
                    if(b[i-1] == a[i-1]){
                        l--;
                    }
                } else{
                    break;
                }
            }

            int r2 = r;
            for(int i=r2;i<n-1;i++){
                if(b[i+1]>=b[i]){
                    if(b[i+1] == a[i+1]){
                        r++;
                    }
                } else{
                    break;
                }
            }
            System.out.println((l+1)+" "+(r+1));
        }
    }

}
