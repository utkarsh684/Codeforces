package Rated_1600_questions;

import java.util.*;

public class EqualFrequencies {

    static class Pair {
        int freq;
        int idx;

        Pair(int f, int i) {
            freq = f;
            idx = i;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int[] freq = new int[26];
            for (char ch : s.toCharArray()) {
                freq[ch - 'a']++;
            }
            int bestChanges = n;
            int bestK = 1;
            for (int k = 1; k <= 26; k++) {
                if (n % k != 0) continue;
                int need = n / k;
                Integer[] ids = new Integer[26];
                for (int i = 0; i < 26; i++) ids[i] = i;
                Arrays.sort(ids, (a, b) -> freq[b] - freq[a]);
                int keep = 0;
                for (int i = 0; i < k; i++) {
                    keep += Math.min(freq[ids[i]], need);
                }
                int changes = n - keep;
                if (changes < bestChanges) {
                    bestChanges = changes;
                    bestK = k;
                }
            }
            int need = n / bestK;
            Integer[] ids = new Integer[26];
            for (int i = 0; i < 26; i++) ids[i] = i;
            Arrays.sort(ids, (a, b) -> freq[b] - freq[a]);
            int[] target = new int[26];
            for (int i = 0; i < bestK; i++) {
                target[ids[i]] = need;
            }
            char[] ans = s.toCharArray();
            List<Integer> replace = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int c = ans[i] - 'a';
                if (target[c] > 0) {
                    target[c]--;
                } else {
                    replace.add(i);
                }
            }
            int ptr = 0;
            for (int c = 0; c < 26; c++) {
                while (target[c] > 0) {
                    ans[replace.get(ptr)] = (char) ('a' + c);
                    ptr++;
                    target[c]--;
                }
            }
            System.out.println(bestChanges);
            System.out.println(new String(ans));
        }
    }
}
