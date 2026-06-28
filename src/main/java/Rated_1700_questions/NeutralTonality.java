package Rated_1700_questions;

import java.util.*;
public class NeutralTonality {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            int[] c = new int[n+m];
            for(int i=0;i<n;i++) a[i] = sc.nextInt();
            for(int i=0;i<m;i++) b[i] = sc.nextInt();
            Arrays.sort(b);
            int i = 0;
            int j = m-1;
            int ind = 0;
            while(i<n || j>=0){
                if (i == n) {
                    c[ind++] = b[j--];
                    continue;
                }
                if (j < 0) {
                    c[ind++] = a[i++];
                    continue;
                }
                if (b[j] >= a[i]) c[ind++] = b[j--];
                else c[ind++] = a[i++];
            }
            for(int k =0;k<c.length;k++){
                System.out.print(c[k] + " ");
            }
            System.out.println();
        }
    }

}
