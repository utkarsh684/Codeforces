import java.util.*;
public class StephanAndPermutation {

    static ArrayList<Integer>[] graph;
    static int[] comp;

    static void dfs(int u, int id){
        comp[u] = id;
        for(int v : graph[u]){
            if(comp[v] == 0){
                dfs(v, id);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++)
                graph[i] = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (i + x <= n) {
                    graph[i].add(i + x);
                    graph[i + x].add(i);
                }
                if (i + y <= n) {
                    graph[i].add(i + y);
                    graph[i + y].add(i);
                }
            }
            int[] p = new int[n + 1];
            for (int i = 1; i <= n; i++)
                p[i] = sc.nextInt();
            comp = new int[n + 1];
            int id = 0;
            for (int i = 1; i <= n; i++) {
                if (comp[i] == 0) {
                    id++;
                    dfs(i, id);
                }
            }
            boolean ok = true;
            for (int i = 1; i <= n; i++) {
                if (comp[i] != comp[p[i]]) {
                    ok = false;
                    break;
                }
            }
            System.out.println(ok ? "YES" : "NO");
        }
    }
}