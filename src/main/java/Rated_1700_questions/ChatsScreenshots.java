package Rated_1700_questions;
import java.util.*;
public class ChatsScreenshots {
    static boolean[] visited;
    static boolean[] pathVisited;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            List<List<Integer>> adj = new ArrayList<>();
            for(int i=0;i<=n;i++){
                adj.add(new ArrayList<>());
            }
            int[] a = new int[n-1];
            for(int i=0;i<k;i++){
                int first = sc.nextInt();
                for(int j=0;j<n-1;j++){
                    a[j] = sc.nextInt();
                }
                for(int j=0;j<n-2;j++){
                    adj.get(a[j]).add(a[j+1]);
                }
            }
            visited = new boolean[n + 1];
            pathVisited = new boolean[n + 1];
            boolean cycle = false;
            for(int i=1;i<=n;i++){
                if(!visited[i]){
                    if(dfs(i, adj)){
                        cycle = true;
                        break;
                    }
                }
            }
            if(cycle){
                System.out.println("NO");
            } else{
                System.out.println("YES");
            }
        }
    }
    public static boolean dfs(int i, List<List<Integer>> adj){
        visited[i] = true;
        pathVisited[i] = true;
        for(int j : adj.get(i)){
            if(!visited[j]){
                if(dfs(j, adj)){
                    return true;
                }
            } else if (pathVisited[j]) {
                return true;
            }
        }
        pathVisited[i] = false;
        return false;
    }
}
