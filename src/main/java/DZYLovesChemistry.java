import java.util.*;

public class DZYLovesChemistry {

    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int size;

    static void dfs(int node) {
        visited[node] = true;
        size++;
        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++)
            graph[i] = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }
        visited = new boolean[n + 1];
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                size = 0;
                dfs(i);
                ans *= (1L << (size - 1));
            }
        }
        System.out.println(ans);
    }
}