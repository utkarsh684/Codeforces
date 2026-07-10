package Rated_1700_questions;

import java.util.*;
public class EvenSubarrays {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++) a[i] = sc.nextInt();
            int[] prefix = new int[n+1];
            prefix[0] = 0;
            for(int i=1;i<n;i++){
                prefix[i] = prefix[i-1]^a[i];
            }
            long ans = (long) n *(n+1)/2;
            int maxValue = 2*n;
            int lim = (int) Math.sqrt(maxValue);
            for(int i=0;i<=lim;i++){
                int[] cnt = new int[maxValue + 1];
                cnt[0]++;
                int k = i * i;
                for (int j = 0; j < n; j++) {
                    int want = prefix[j] ^ k;
                    if (want <= maxValue) ans -= cnt[want];
                    cnt[prefix[j]]++;
                }
            }
            System.out.println(ans);
        }
    }

}
