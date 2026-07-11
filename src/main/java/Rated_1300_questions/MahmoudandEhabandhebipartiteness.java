package Rated_1300_questions;

import java.util.*;
public class MahmoudandEhabandhebipartiteness {

    static long cnt0 = 0;
    static long cnt1 = 0;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int[] color = new int[n+1];
        Arrays.fill(color, -1);
        dfs(adj, color, 1, 0);

        long ans = cnt0 * cnt1 - (n - 1);
        System.out.println(ans);
    }
    static void dfs(ArrayList<ArrayList<Integer>> adj, int[] color, int src, int c){
        color[src] = c;
        if(c == 0){
            cnt0++;
        } else{
            cnt1++;
        }
        for(int next : adj.get(src)){
            if(color[next] == -1){
                dfs(adj, color, next, 1-c);
            }
        }
    }
}
