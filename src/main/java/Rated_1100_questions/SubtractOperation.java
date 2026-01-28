package Rated_1100_questions;

import java.util.*;
public class SubtractOperation {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            List<Long> v = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                v.add(sc.nextLong());
            }

            Map<Long, Boolean> mp = new HashMap<>();

            for (Long it : v) {
                mp.put(it, true);
            }

            boolean isFound = false;
            for (int i = 0; i < n; i++) {
                if (mp.containsKey(v.get(i) - k)) {
                    isFound = true;
                    break;
                }
            }
            if(isFound){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }

}
