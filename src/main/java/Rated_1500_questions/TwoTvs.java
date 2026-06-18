package Rated_1500_questions;

import java.util.*;
public class TwoTvs {

    static class Pair {
        int time;
        int delta;

        Pair(int time, int delta) {
            this.time = time;
            this.delta = delta;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Pair> events = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            events.add(new Pair(l, 1));
            events.add(new Pair(r + 1, -1));
        }
        events.sort(Comparator.comparingInt(a -> a.time));
        int active = 0;
        for (Pair p : events) {
            active += p.delta;
            if (active > 2) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}