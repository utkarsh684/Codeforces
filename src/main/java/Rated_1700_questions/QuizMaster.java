package Rated_1700_questions;

import java.util.*;
public class QuizMaster {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++) a[i] = sc.nextInt();
            Arrays.sort(a);
            int cnt = 0;
            int[] freq = new int[m+1];
            int ans = Integer.MAX_VALUE;
            for(int l=0, r=-1; l<n; l++){
                while(cnt<m && r+1<n){
                    r++;
                    cnt += addDivisors(a[r], m, freq);
                }
                if(cnt<m) break;
                ans = Math.min(ans, a[r]-a[l]);
                cnt -= removeDivisors(a[l], m, freq);
            }
            System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
        }
    }

    public static int addDivisors(int val, int m, int[] freq){
        int gained = 0;
        int lim = (int)Math.sqrt(val);
        for(int i=1; i<=lim; i++){
            if(val%i!=0) continue;;
            if(i<=m){
                if(freq[i] == 0){
                    gained++;
                }
                freq[i]++;
            }
            int k = val / i;
            if (k != i && k <= m) {
                if (freq[k] == 0) gained++;
                freq[k]++;
            }
        }
        return gained;
    }

    private static int removeDivisors(int val, int m, int[] freq) {
        int lost = 0;
        int lim = (int) Math.sqrt(val);
        for (int i = 1; i <= lim; i++) {
            if (val % i != 0) continue;
            if (i <= m) {
                freq[i]--;
                if (freq[i] == 0) lost++;
            }
            int k = val / i;
            if (k != i && k <= m) {
                freq[k]--;
                if (freq[k] == 0) lost++;
            }
        }
        return -lost;
    }
}
