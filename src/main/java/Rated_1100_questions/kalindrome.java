package Rated_1100_questions;

import java.util.*;
public class kalindrome {

    private static boolean check(List<Long> a, long x) {
        int n = a.size();
        List<Long> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (a.get(i) != x) {
                b.add(a.get(i));
            }
        }
        int m = b.size();
        for (int i = 0; i < m; i++) {
            if (!b.get(i).equals(b.get(m - i - 1))) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalin(List<Long> a){
        int s = a.size();
        for(int i=0;i<s;i++){
            if(!a.get(i).equals(a.get(s-i-1))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Long> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(sc.nextLong());
            }
            boolean isPlaindrome = false;
            if(isPalin(a)){
                System.out.println("YES");
            } else{
                for (int i = 0; i < n; i++) {
                    if (!a.get(i).equals(a.get(n - i - 1))) {
                        if (check(a, a.get(i)) || check(a, a.get(n - i - 1))) {
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }
                        break;
                    }
                }
            }
        }
    }
}
