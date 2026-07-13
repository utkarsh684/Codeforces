import java.util.*;
public class TwoDigitsString {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String a = sc.next();
            String b = sc.next();
            int n = a.length();
            int m = b.length();
            int[] pre1 = new int[n+1];
            int[] pre2 = new int[m+1];
            for(int i=1;i<=n;i++){
                pre1[i] = (pre1[i-1]+(a.charAt(i-1)-'0'))%10;
            }
            for(int i=1;i<=m;i++){
                pre2[i] = (pre2[i-1]+(b.charAt(i-1)-'0'))%10;
            }
            if(pre1[n]!=pre2[m]){
                System.out.println(-1);
                continue;
            }
            int lcs = helper(pre1, pre2);
            System.out.println(lcs-1);
        }
    }

    public static int helper(int[] a, int[] b){
        int n = a.length;
        int m = b.length;
        int[][] dp = new int[n+1][m+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(a[i-1] == b[j-1]){
                    dp[i][j] = 1+dp[i-1][j-1];
                } else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }

}
