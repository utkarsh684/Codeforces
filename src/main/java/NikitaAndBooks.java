import java.util.*;
public class NikitaAndBooks {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            boolean ok = true;

            for (int i = 0; i < n - 1; i++) {
                if (a[i] < i + 1) {
                    ok = false;
                    break;
                }

                long extra = a[i] - (i + 1);
                a[i] = i + 1;
                a[i + 1] += extra;
            }

            if (ok && a[n - 1] >= n)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

}
