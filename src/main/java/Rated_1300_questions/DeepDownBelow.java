package Rated_1300_questions;

import java.util.*;
public class DeepDownBelow {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            List<int[]> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();
                int[] v = new int[m];
                for (int j = 0; j < m; j++) {
                    int x = sc.nextInt();
                    v[j] = x - j + 1;
                }
                Arrays.sort(v);
                a.add(new int[]{v[m - 1], m});
            }
            a.sort(Comparator.comparingInt(o -> o[0]));
            int ans = a.get(0)[0];
            int increase = a.get(0)[1];
            for (int i = 1; i < n; i++) {
                ans = Math.max(ans, a.get(i)[0] - increase);
                increase += a.get(i)[1];
            }
            System.out.println(ans);
        }
    }

}
