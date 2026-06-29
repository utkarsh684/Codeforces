package Rated_1100_questions;

import java.util.*;
public class CoPRIME {

    static List<Integer>[] pairs = new ArrayList[1001];

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=1000;i++){
            pairs[i] = new ArrayList<>();
            for (int j = 1; j <= 1000; j++) {
                if (gcd(i, j) == 1) {
                    pairs[i].add(j);
                }
            }
        }
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] lastSeen = new int[1001];
            for(int i=1;i<=n;i++){
                int x = sc.nextInt();
                lastSeen[x] = i;
            }
            int ans = -1;
            for(int i=1;i<=1000;i++){
                if(lastSeen[i] == 0) continue;

                for(int j : pairs[i]){
                    if(lastSeen[j] != 0){
                        ans = Math.max(ans, lastSeen[i]+lastSeen[j]);
                    }
                }
            }
            System.out.println(ans);
        }
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
