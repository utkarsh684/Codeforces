package Rated_1700_questions;

import java.util.*;
public class IrisandGameontheTree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] deg = new int[n];
            for (int i = 0; i < n - 1; ++i) {
                int u = sc.nextInt() - 1;
                int v = sc.nextInt() - 1;
                deg[u]++;
                deg[v]++;
            }
            String s = sc.next();
            int z = 0;
            int u = 0;
            int q = 0;
            int o = 0;
            for(int i=1;i<n;i++){
                if (deg[i] == 1) {
                    char c = s.charAt(i);
                    if (c == '0') z++;
                    else if (c == '1') o++;
                    else q++;
                } else {
                    if (s.charAt(i) == '?') u++;
                }
            }
            int ans;
            char root = s.charAt(0);
            if(root != '?'){
                ans = (root == '1' ? z:o) + (q+1)/2;
            } else{
                if(z == o && u%2==1){
                    ans = z+(q+1)/2;
                } else{
                    ans = Math.max(z,o)+q/2;
                }
            }
            System.out.println(ans);
        }
    }
}
