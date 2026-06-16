package Rated_1400_questions;

import java.util.*;
public class BerlandRegional {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] u = new int[n];
            int[] s = new int[n];

            for(int i=0;i<n;i++){
                u[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                s[i] = sc.nextInt();
            }
            List<List<Integer>> skills = new ArrayList<>(n);
            for (int i = 0; i < n; i++) skills.add(new ArrayList<>());
            for (int i = 0; i < n; i++) skills.get(u[i] - 1).add(s[i]);
            for (int i = 0; i < n; i++) Collections.sort(skills.get(i));
            long[] ans = new long[n + 1];
            for (int i = 0; i < n; i++) {
                List<Integer> v = skills.get(i);
                int nums = v.size();
                if (nums == 0) continue;

                long[] pre = new long[nums + 1];
                for (int j = 0; j < nums; j++) pre[j + 1] = pre[j] + v.get(j);
                for (int k = 1; k <= nums; k++) {
                    ans[k] += pre[nums] - pre[nums % k];
                }
            }
            for(int i=1;i<=n;i++){
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
