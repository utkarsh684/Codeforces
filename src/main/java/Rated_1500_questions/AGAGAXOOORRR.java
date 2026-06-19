package Rated_1500_questions;

import java.util.*;
public class AGAGAXOOORRR {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int x = 0, pre = 0, suf = 0;
            for(int i : a){
                x ^= i;
            }
            if(x == 0){
                System.out.println("YES");
            } else{
                int sufind = -1;
                int preind = -1;
                for(int i=0;i<n;i++){
                    pre ^= a[i];
                    if(pre == x){
                        preind = i;
                        break;
                    }
                }
                for(int i=n-1; i>=0; i--){
                    suf ^= a[i];
                    if(suf == x){
                        sufind = i;
                        break;
                    }
                }

                if(sufind > preind){
                    System.out.println("YES");
                } else{
                    System.out.println("NO");
                }
            }
        }
    }

}
