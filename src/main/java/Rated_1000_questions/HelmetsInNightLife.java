package Rated_1000_questions;

import java.util.*;
public class HelmetsInNightLife {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int p = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();

            int[][] arr = new int[n][2];
            for (int i = 0; i < n; i++) {
                arr[i][0] = b[i]; // cost
                arr[i][1] = a[i]; // helmets
            }

            Arrays.sort(arr, Comparator.comparingInt(x -> x[0]));

            long ans = p;
            int alreadyShared = n - 1;

            for (int i = 0; i < n; i++) {
                int canShare = arr[i][1];
                int cost = arr[i][0];

                if(cost>=p){
                    break;
                }

                if(canShare+alreadyShared>n){
                    ans += (long) (n - alreadyShared) *cost;
                    alreadyShared = n;
                } else{
                    ans += (long) canShare *cost;
                    alreadyShared += canShare;
                }
            }

            ans += (long) (n - alreadyShared) *p;

            System.out.println(ans);
        }
    }
}

