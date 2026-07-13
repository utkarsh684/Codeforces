package Rated_1500_questions;

import java.util.*;
public class CutThemAll {

    static int ans = 0;
    static ArrayList<ArrayList<Integer>> adj;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==1){
            System.out.println(-1);
            return;
        }
        adj = new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n-1;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        dfs(1,0);
        System.out.println(ans);
    }

    static int dfs(int node, int parent){
        int size = 1;
        for(int child : adj.get(node)){
            if(child == parent)
                continue;

            size += dfs(child, node);
        }

        if(node != 1 && size%2==0){
            ans++;
        }
        return size;
    }

}
