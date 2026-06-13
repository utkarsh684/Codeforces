package Rated_1400_questions;

import java.util.*;
public class IvaAndPav {
    static int[][] pre;
    static int n;
    static int[] a;

    static int rangeAnd(int l, int r) {
        int ans = 0;
        for (int i = 0; i < 30; i++) {
            if (pre[i][r + 1] - pre[i][l] == 0) {
                ans |= (1 << i);
            }
        }
        return ans;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            n = sc.nextInt();
            a = new int[n];

            for(int i=0;i<n;i++) a[i] = sc.nextInt();

            pre = new int[30][n+1];
            for(int j=0;j<30;j++){
                pre[j][0] = 0;
                for(int i=0;i<n;i++){
                    if (((a[i] >> j) & 1) == 1) pre[j][i + 1] = pre[j][i];
                    else pre[j][i + 1] = pre[j][i] + 1;
                }
            }
            int q = sc.nextInt();
            while(q-->0){
                int l = sc.nextInt() - 1;
                int k = sc.nextInt();

                if(a[l] < k){
                    System.out.println(-1);
                } else{
                    int low = l, high = n - 1;
                    while (low < high) {
                        int mid = (low + high + 1) >>> 1;
                        if (rangeAnd(l, mid) >= k) low = mid;
                        else high = mid - 1;
                    }
                    System.out.println(low+1);
                }
            }

        }
    }

}
