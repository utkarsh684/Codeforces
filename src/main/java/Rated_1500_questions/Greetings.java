package Rated_1500_questions;

import java.util.*;
public class Greetings {

    static class FenwickTree {
        int[] tree;

        FenwickTree(int size) { tree = new int[size + 2]; }

        void add(int index, int delta) {
            for (int i = index; i < tree.length; i += i & -i) tree[i] += delta;
        }

        int sum(int index) {
            int result = 0;
            for (int i = index; i > 0; i -= i & -i) result += tree[i];
            return result;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            Pair[] intervals = new Pair[n];

            for (int i = 0; i < n; i++) {
                intervals[i] = new Pair(sc.nextInt(), sc.nextInt());
            }
            Arrays.sort(intervals, (p1, p2) -> Integer.compare(p1.start, p2.start));
            int[] ends = new int[n];
            for (int i = 0; i < n; i++) ends[i] = intervals[i].end;
            int[] sortedEnds = ends.clone();
            Arrays.sort(sortedEnds);

            int m = 0;
            for (int i = 0; i < n; i++) if (i == 0 || sortedEnds[i] != sortedEnds[i - 1]) sortedEnds[m++] = sortedEnds[i];

            FenwickTree fenwick = new FenwickTree(m + 2);
            long inversions = 0L;

            for (int i = 0; i < n; i++) {
                int rank = 1 + Arrays.binarySearch(sortedEnds, 0, m, intervals[i].end);
                int smallerCount = fenwick.sum(rank - 1);
                inversions += i - smallerCount;
                fenwick.add(rank, 1);
            }

            System.out.println(inversions);

        }

    }

    static class Pair {
        int start, end;
        Pair(int start, int end) { this.start = start; this.end = end; }
    }
}
