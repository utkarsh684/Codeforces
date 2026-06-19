package Rated_1500_questions;

import java.util.*;
public class TheFairNutandString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        final long MOD = 1_000_000_007L;
        long pro = 1;
        long cnt = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'a'){
                cnt++;
            } else if (ch == 'b') {
                pro = (pro*(cnt+1))%MOD;
                cnt = 0;
            }
        }
        pro = (pro*(cnt+1))%MOD;
        long ans = (pro-1+MOD)%MOD;
        System.out.println(ans);
    }
}
