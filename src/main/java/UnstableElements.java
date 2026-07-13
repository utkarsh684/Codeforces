import java.util.*;
public class UnstableElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            ArrayList<Integer> ls = new ArrayList<>();
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int cnt = 1;
            for(int i=1;i<n;i++){
                if(a[i] != a[i-1]){
                    ls.add(cnt);
                    cnt = 1;
                } else{
                    cnt++;
                }
            }
            ls.add(cnt);
            Collections.sort(ls);
            int m = ls.size();
            int i=0;
            int d = 0;
            int ans = 0;
            while(i<m){
                int len = ls.get(i);
                int x = len-1;
                int q = m-i;
                int curLen = n - d - x * q;
                if (curLen <= k && (k - curLen) % q == 0)
                    ans++;
                int j = i;
                while(j<m && ls.get(j) == len){
                    j++;
                }
                d += (j-i)*ls.get(i);
                i=j;
            }
            System.out.println(ans);
        }
    }
}
