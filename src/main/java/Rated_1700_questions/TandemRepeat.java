package Rated_1700_questions;

import java.util.*;
public class TandemRepeat {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();

            int ans = 0;
            int n = s.length();
            for(int d = 1; d<=n/2; d++){
                int cnt = 0;
                for(int j=0;j<d;j++){
                    if(compatible(s.charAt(j), s.charAt(j+d))) cnt++;
                }
                if(cnt == d) ans = Math.max(ans, d);

                for(int j = 0; j<n-2*d; j++){
                    if(compatible(s.charAt(j), s.charAt(j+d))) cnt--;
                    if(compatible(s.charAt(j+d), s.charAt(j+2*d))) cnt++;
                    if(cnt == d) ans = Math.max(d, ans);
                }
            }
            System.out.println(ans);
        }
    }

    public static boolean compatible(char a, char b){
        if(a == '?' || b == '?' || a == b){
            return true;
        }
        return false;
    }

}
