package Rated_1500_questions;

import java.util.*;
public class KAmazingNumbers {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n+1];
            List<Integer>[] pos = new ArrayList[n+1];
            for (int i = 1; i <= n; i++) {
                pos[i] = new ArrayList<>();
            }
            for(int i=1;i<=n;i++){
                a[i] = sc.nextInt();
                pos[a[i]].add(i);
            }

            int[] ans = new int[n+1];
            Arrays.fill(ans, Integer.MAX_VALUE);
            for(int i=1;i<=n;i++){
                if(pos[i].isEmpty()) continue;
                int maxGap = pos[i].get(0);
                for(int j = 1;j<pos[i].size();j++){
                    maxGap = Math.max(maxGap, pos[i].get(j) - pos[i].get(j-1));
                }
                maxGap = Math.max(maxGap, n+1 - pos[i].get(pos[i].size()-1));

                ans[maxGap] = Math.min(ans[maxGap], i);
            }
            for (int k = 2; k <= n; k++) {
                ans[k] = Math.min(ans[k], ans[k - 1]);
            }

            for (int k = 1; k <= n; k++) {
                if (ans[k] == Integer.MAX_VALUE) {
                    System.out.print(-1 + " ");
                } else {
                    System.out.print(ans[k] + " ");
                }
            }

            System.out.println();
        }
    }

}
