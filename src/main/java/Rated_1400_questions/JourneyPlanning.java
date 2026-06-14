package Rated_1400_questions;

import java.util.*;
public class JourneyPlanning {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Long, Long> map = new HashMap<>();
        long ans = 0;
        for(int i=1;i<=n;i++){
            long b = sc.nextLong();
            long key = b - i;
            map.put(key,
                    map.getOrDefault(key,0L) + b);
            ans = Math.max(ans, map.get(key));
        }
        System.out.println(ans);
    }
}
