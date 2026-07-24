package Rated_1500_questions;

import java.util.*;
public class EhabandPatheticMEXs {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<int[]>> adj = new ArrayList<>(n+1);
        for(int i=0;i<=n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<n-1;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(new int[]{v,i});
            adj.get(v).add(new int[]{u,i});
        }
        int k=0;
        int[] ans = new int[n-1];
        Arrays.fill(ans, -1);
        for(int i=1;i<=n;i++){
            if(adj.get(i).size()>=3){
                ans[adj.get(i).get(0)[1]] = 0;
                ans[adj.get(i).get(1)[1]] = 1;
                ans[adj.get(i).get(2)[1]] = 2;
                k=3;
                break;
            }
        }
        for(int i=0;i<n-1;i++){
            if(ans[i] == -1){
                ans[i] = k++;
            }
        }
        for(int x : ans){
            System.out.print(x+" ");
        }
    }

}
