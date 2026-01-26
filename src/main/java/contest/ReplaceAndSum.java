package contest;

import java.util.*;
public class ReplaceAndSum {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }

            for(int i=0;i<n;i++){
                b[i] = sc.nextInt();
            }

            int[][] lr = new int[q][2];
            for(int i=0;i<q;i++){
                lr[i][0] = sc.nextInt();
                lr[i][1] = sc.nextInt();
            }

            for(int i=0;i<n;i++){
                if(b[i]>a[i]){
                    a[i] = b[i];
                }
            }

            for(int i=0;i<n-1;i++){
                if(a[i]<a[i+1]){
                    a[i] = a[i+1];
                }
            }

            int[] prefix = new int[n];
            prefix[0] = a[0];
            for(int i=1;i<n;i++){
                prefix[i] = a[i] + prefix[i-1];
            }

            int[] ans = new int[q];
            for(int i=0;i<q;i++){
                int r = lr[i][1];
                int l = lr[i][0];
                 r--;
                 l--;

                 if(l==0){
                     ans[i] = prefix[r];
                 } else{
                     ans[i] = prefix[r]-prefix[l-1];
                 }
            }

            for(int i=0;i<q;i++){
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
    }

}
