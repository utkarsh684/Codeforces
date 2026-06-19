package Rated_1500_questions;

import java.util.*;
public class BalancedBitString {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            char[] c = sc.next().toCharArray();

            boolean possible = true;
            for(int i=0;i<k;i++){
                char val = '?';
                for(int j=i;j<n;j+=k){
                    if(c[j] == '?') continue;
                    if(val == '?') val = c[j];
                    else if (val != c[j]) {
                        possible = false;
                        break;
                    }
                }
                if(!possible){
                    break;
                }
                for(int j= i ;j<n; j+=k){
                    if(c[j] == '?') c[j] = val;
                }
            }

            if(!possible){
                System.out.println("NO");
                continue;
            }

            int ones = 0;
            int zero = 0;
            for(int i=0;i<k;i++){
                if(c[i] == '0') zero++;
                else if(c[i] == '1') ones++;
            }

            if (ones > k / 2 || zero > k / 2) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }

}
