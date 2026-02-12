package Rated_1200_questions;

import java.util.*;
public class PleasantPairs {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            Pair[] a = new Pair[n];
            for(int i=0;i<n;i++){
                long x = sc.nextLong();
                a[i] = new Pair(x, i+1);
            }

            Arrays.sort(a, Comparator.comparingLong(p -> p.val));
            int ans = 0;

            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if((a[i].val)*(a[j].val) >= 2*n){
                        break;
                    }
                    if((a[i].val)*(a[j].val) == a[i].ind+a[j].ind){
                        ans++;
                    }
                }
            }

            System.out.println(ans);
        }
    }

    static class Pair{
        long val;
        int ind;

        Pair(long val, int ind){
            this.val = val;
            this.ind = ind;
        }

    }

}
