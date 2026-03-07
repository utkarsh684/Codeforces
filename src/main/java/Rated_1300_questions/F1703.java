package Rated_1300_questions;

import java.util.*;

public class F1703 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            solve(scanner);
        }
        scanner.close();
    }

    private static void solve(Scanner scanner) {

        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        long res = 0;
        List<Integer> v = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (a[i] >= i + 1) {
                continue;
            }

            int count = customBinarySearch(v, a[i]);
            res += count;

            v.add(i + 1);
        }

        System.out.println(res);
    }

    private static int customBinarySearch(List<Integer> list, int value) {

        int left = 0;
        int right = list.size() - 1;
        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (list.get(mid) < value) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans + 1;
    }
}