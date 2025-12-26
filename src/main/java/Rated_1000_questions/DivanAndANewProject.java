package Rated_1000_questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.*;

public class DivanAndANewProject {

    public static void main(String args[]) throws IOException {
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();
        while(t-->0){
            int n = fs.nextInt();
            long[] a = new long[n];
            for(int i=0;i<n;i++){
                a[i] = fs.nextLong();
            }
            List<Pair> Map = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                Map.add(new Pair(a[i], i));
            }

            Map.sort((p1, p2) -> Long.compare(p2.visits, p1.visits));

            long[] ans = new long[(int) n + 1];

            ans[0] = 0;

            long minutes = 0;
            long coordinate = 1;
            for (int i = 0; i < n; i++) {
                ans[Map.get(i).index + 1] = coordinate;
                minutes += (2 * Math.abs(coordinate) * Map.get(i).visits);
                if (coordinate < 0) {
                    coordinate = Math.abs(coordinate) + 1;
                } else {
                    coordinate = -coordinate;
                }
            }

            System.out.println(minutes);
            for (long x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    private static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }

    static class Pair{
        long visits;
        int index;

        Pair(long visits, int index){
            this.visits = visits;
            this.index = index;
        }
    }

}
