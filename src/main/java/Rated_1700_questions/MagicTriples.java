package Rated_1700_questions;

import java.util.*;
public class MagicTriples {

    static final int MAX = 1_000_000;
    static final int[] cnt = new int[MAX+1];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            List<Integer> ls = new ArrayList<>();
            for(int i=0;i<n;i++){
                int x = sc.nextInt();
                if(cnt[x] == 0) ls.add(x);
                cnt[x]++;
            }
            long ans = 0;
            for(int x : ls){
                if(cnt[x] >= 3){
                    ans += (long) cnt[x] * (cnt[x] - 1) * (cnt[x] - 2);
                }
                for(int b=2; x*b*b<=MAX; b++){
                    int a1 = x;
                    int a2 = x*b;
                    int a3 = x*b*b;
                    ans += (long) cnt[a1] *cnt[a2]*cnt[a3];
                }
            }
            for (int x : ls) cnt[x] = 0;
            System.out.println(ans);
        }
    }

}
