package Rated_1400_questions;

import java.util.*;
public class NewsDistribution {

    static int[] par, size;

    public static int find(int node){
        if(node == par[node]){
            return node;
        }
        int ulp = find(par[node]);
        par[node] = ulp;
        return par[node];
    }

    public static void unite(int u, int v){
        int ulp_u = find(u);
        int ulp_v = find(v);
        if(ulp_u == ulp_v){
            return;
        }
        if(size[ulp_u] < size[ulp_v]){
            par[ulp_u] = ulp_v;
            size[ulp_v] += size[ulp_u];
        } else{
            par[ulp_v] = ulp_u;
            size[ulp_u] += size[ulp_v];
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        size = new int[n];
        par = new int[n];
        for(int i=0;i<n;i++){
            size[i] = 1;
            par[i] = i;
        }
        for(int i=0;i<m;i++){
            int k = sc.nextInt();
            if(k>0){
                int first = sc.nextInt()-1;
                for(int j=1;j<k;j++){
                    int a = sc.nextInt()-1;
                    unite(first, a);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(size[find(i)]).append(' ');
        }
        System.out.print(sb.toString());
    }

}
