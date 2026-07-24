package Rated_1500_questions;

import java.util.*;
public class EdgyTrees {

    static final long MOD = 1000000007;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    static long power(long a, long b) {
        long ans = 1;

        while (b > 0) {
            if ((b & 1) == 1)
                ans = (ans * a) % MOD;

            a = (a * a) % MOD;
            b >>= 1;
        }

        return ans;
    }

    static int dfs(int u){
        int size = 1;
        visited[u] = true;
        for(int next : graph[u]){
            if(!visited[next]){
                size += dfs(next);
            }
        }
        return size;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        graph = new ArrayList[n+1];
        visited = new boolean[n+1];
        for(int i=1;i<=n;i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0;i<n-1;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int color = sc.nextInt();
            if(color == 0){
                graph[u].add(v);
                graph[v].add(u);
            }
        }
        long answer = power(n, k);
        for(int i=1;i<=n;i++){
            if(!visited[i]){
                int size = dfs(i);
                answer = (answer - power(size, k) + MOD)%MOD;
            }
        }
        System.out.println(answer);
    }

}
