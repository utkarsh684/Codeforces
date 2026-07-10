package Rated_1700_questions;

import java.util.*;
public class DrunkenMaze {

    static class State{
        int x, y;
        int dir;
        int cnt;
        int dist;

        State(int x, int y, int dir, int cnt, int dist) {
            this.x = x;
            this.y = y;
            this.dir = dir;
            this.cnt = cnt;
            this.dist = dist;
        }
    }

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] grid = new char[n][m];
        int sx = 0;
        int sy = 0;
        for(int i=0;i<n;i++){
            String s = sc.next();
            for(int j=0;j<m;j++){
                grid[i][j] = s.charAt(j);
                if(grid[i][j] == 'S'){
                    sx = i;
                    sy = j;
                }
            }
        }
        boolean[][][][] vis = new boolean[n][m][5][4];
        Queue<State> q = new LinkedList<>();
        q.offer(new State(sx, sy, 4, 0, 0));
        vis[sx][sy][4][0] = true;
        while(!q.isEmpty()){
            State curr = q.poll();
            if(grid[curr.x][curr.y] == 'T'){
                System.out.println(curr.dist);
                return;
            }
            for(int i=0;i<4;i++){
                int nx = curr.x+dx[i];
                int ny = curr.y+dy[i];
                if(nx<0 || ny<0 || nx>=n || ny>=m){
                    continue;
                }
                if(grid[nx][ny] == '#'){
                    continue;
                }
                int newCount;
                if(i == curr.dir){
                    newCount = curr.cnt+1;
                } else{
                    newCount = 1;
                }
                if (newCount > 3)
                    continue;
                if (!vis[nx][ny][i][newCount]) {
                    vis[nx][ny][i][newCount] = true;
                    q.offer(new State(nx, ny, i, newCount,
                            curr.dist + 1));
                }
            }
        }
        System.out.println(-1);
    }

}
