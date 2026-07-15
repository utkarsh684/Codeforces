import java.util.*;
public class YaroslavandProductivity {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            long[] a = new long[n];
            int[] b = new int[m];
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
            }
            for(int i=0;i<m;i++){
                b[i] = sc.nextInt();
            }
            long[] pre = new long[n+1];
            pre[0] = 0;
            for (int i = 0; i < n; i++) {
                pre[i + 1] = pre[i] + a[i];
            }
            long sum = pre[n];
            long ans = sum;
            for(int i=0;i<m;i++){
                int p = b[i];
                long currSum = pre[p];
                long newSum = (-1)*pre[p];
                long s = sum + newSum-currSum;
                ans = Math.max(ans, s);
            }
            System.out.println(ans);
        }
    }

}
