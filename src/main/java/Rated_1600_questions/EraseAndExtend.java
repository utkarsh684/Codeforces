package Rated_1600_questions;

import java.util.*;
public class EraseAndExtend {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        char[] best = new char[k];
        Arrays.fill(best, 'z');
        String ans = new String(best);

        for(int len=1;len<=n; len++){
            String ss = s.substring(0, len);
            while(ss.length() < k) ss += ss;
            ss = ss.substring(0,k);
            ans = ss.compareTo(ans) < 0 ? ss : ans;
        }
        System.out.println(ans);
    }

}
