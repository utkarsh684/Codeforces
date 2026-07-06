package Rated_1400_questions;

import java.util.*;
public class AddModulo10 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i=0;i<n;i++) {
                a[i] = sc.nextLong();
                if (a[i] % 2 == 1) {
                    a[i] += a[i] % 10;
                }
            }
            boolean isEqual = true;
            for(int i=1;i<n;i++){
                if(a[i] != a[0]) {
                    isEqual = false;
                    break;
                }
            }
            if(isEqual){
                System.out.println("YES");
            } else{
                boolean hasZero = false;
                for (long x : a) {
                    if (x % 10 == 0) {
                        hasZero = true;
                        break;
                    }
                }
                if (hasZero) {
                    System.out.println("NO");
                } else{
                    for (int i = 0; i < n; i++) {
                        while (a[i] % 10 != 2) {
                            a[i] += a[i] % 10;
                        }
                        a[i] %= 20;
                    }

                    boolean allEqual = true;
                    for (int i = 1; i < n; i++) {
                        if (a[i] != a[0]) {
                            allEqual = false;
                            break;
                        }
                    }
                    System.out.println(allEqual ? "YES" : "NO");
                }
            }
        }
    }

}
