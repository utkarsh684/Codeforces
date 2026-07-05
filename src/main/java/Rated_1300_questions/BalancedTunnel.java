package Rated_1300_questions;

import java.util.*;
public class BalancedTunnel {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        Map<Integer, Integer> entryIndexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            entryIndexMap.put(a[i], i);
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
            c[entryIndexMap.get(b[i])] = i;
        }
        int maxIndexSeen = c[0];
        int overtakes = 0;

        for (int i = 1; i < n; i++) {
            if (c[i] < maxIndexSeen) {
                overtakes++;
            }
            maxIndexSeen = Math.max(maxIndexSeen, c[i]);
        }
        System.out.println(overtakes);
    }
}
