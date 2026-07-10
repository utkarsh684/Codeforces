import java.util.*;
public class IceSkating {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        boolean[] visited = new boolean[n];
        int components = 0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i, visited, a, n);
                components++;
            }
        }
        System.out.println(components-1);
    }

    public static void dfs(int node, boolean[] visited, int[][] a, int n){
        visited[node] = true;
        for(int i=0;i<n;i++){
            if(!visited[i] && (a[i][0] == a[node][0] || a[i][1] == a[node][1])){
                dfs(i, visited, a, n);
            }
        }
    }

}
