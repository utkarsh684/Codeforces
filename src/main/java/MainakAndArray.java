import java.util.*;

public class MainakAndArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long ans = a[n-1] - a[0];  // case 1

            // case 2
            for (int i = 0; i < n-1; i++) {
                ans = Math.max(ans, a[i] - a[i+1]);
            }

            // case 3
            for (int i = 1; i < n; i++) {
                ans = Math.max(ans, a[i] - a[0]);
            }

            // case 4
            for (int i = 0; i < n-1; i++) {
                ans = Math.max(ans, a[n-1] - a[i]);
            }

            System.out.println(ans);
        }
    }
}

