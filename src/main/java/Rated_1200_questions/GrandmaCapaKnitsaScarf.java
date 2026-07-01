package Rated_1200_questions;

import java.util.*;
public class GrandmaCapaKnitsaScarf {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int l = 0;
            int r = n-1;
            while(l<r && s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            }

            if(l>=r){
                System.out.println(0);
            } else{
                int ans1 = check(s, s.charAt(l));
                int ans2 = check(s, s.charAt(r));
                int ans = Math.min(ans1, ans2);

                if (ans == Integer.MAX_VALUE) System.out.println(-1);
                else System.out.println(ans);
            }
        }
    }

    static int check(String s, char  ch){
        int l = 0;
        int r = s.length()-1;
        int count = 0;

        while(l<r){
            if(s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            } else if (s.charAt(l) == ch) {
                l++;
                count++;
            } else if (s.charAt(r) == ch) {
                r--;
                count++;
            } else{
                return Integer.MAX_VALUE;
            }
        }
        return count;
    }

}
