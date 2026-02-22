package Rated_1200_questions;

import java.util.*;
public class RemoveSmallestMultiple {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String T = sc.next();
            long ans = 0;

            boolean[] isRemoved = new boolean[n+1];

            for(int i = 1;i<=n;i++){
                for(int j = i;j<=n;j+=i){
                    if(T.charAt(j-1) == '1'){
                        break;
                    }

                    if(isRemoved[j])
                        continue;
                    else{
                        isRemoved[j] = true;
                        ans += i;
                    }
                }
            }

            System.out.println(ans);
        }
    }
}