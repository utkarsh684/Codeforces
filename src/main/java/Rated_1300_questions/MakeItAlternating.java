package Rated_1300_questions ;

import java.util.Scanner;
public class MakeItAlternating {
    static final long MOD = 998244353;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            long ans = 1;
            int ansLen = 1;
            int curr = 1;
            int n = s.length();
            for(int i=1;i<n;i++){
                if(s.charAt(i) != s.charAt(i-1)){
                    ansLen++;
                    ans = (ans*curr)%MOD;
                    curr = 1;
                } else{
                    curr++;
                }
            }
            ans = (ans*curr)%MOD;
            for(int i=1;i<=n-ansLen;i++){
                ans = (ans*i)%MOD;
            }
            System.out.println((n - ansLen) + " " + ans);
        }
    }
}