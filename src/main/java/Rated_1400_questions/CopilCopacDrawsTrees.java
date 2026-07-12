package Rated_1400_questions;

import java.util.*;
public class CopilCopacDrawsTrees {

    static class Pair {
        int node;
        int idx;

        Pair(int node, int idx) {
            this.node = node;
            this.idx = idx;
        }
    }

    static ArrayList<ArrayList<Pair>> adj;
    static int[] dp;
    static int ans;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            adj = new ArrayList<>();
            for(int i=0;i<=n;i++){
                adj.add(new ArrayList<>());
            }
            for(int i=1;i<=n-1;i++){
                int u = sc.nextInt();
                int v = sc.nextInt();
                adj.get(u).add(new Pair(v, i));
                adj.get(v).add(new Pair(u, i));
            }
            dp = new int[n+1];
            dp[1] = 1;
            ans = 1;
            dfs(1, 0, 0);
            System.out.println(ans);
        }
    }

    public static void dfs(int node, int parent, int parIndex){
        ans = Math.max(ans, dp[node]);
        for(Pair child : adj.get(node)){
            if(child.node == parent){
                continue;
            }
            if(child.idx > parIndex){
                dp[child.node] = dp[node];
            }else {
                dp[child.node] = dp[node] + 1;
            }
            dfs(child.node, node, child.idx);
        }
    }

}
