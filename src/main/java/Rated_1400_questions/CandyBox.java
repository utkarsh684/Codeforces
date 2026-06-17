package Rated_1400_questions;

import java.util.*;
import java.util.stream.Collectors;

public class CandyBox {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            HashMap<Integer, Integer> map = new HashMap<>();
            HashSet<Integer> set = new HashSet<>();
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                map.put(a[i], map.getOrDefault(a[i], 0)+1);
            }
            LinkedHashMap<Integer, Integer> map2 = map.entrySet()
                    .stream()
                    .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                    .collect(Collectors.toMap(
                            Map.Entry::getKey,
                            Map.Entry::getValue,
                            (oldValue, newValue) -> oldValue,
                            LinkedHashMap::new
                    ));
            int ans = 0;
            int last = Integer.MAX_VALUE;
            for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
                int value = entry.getValue();
                if(last <= 0) break;
                if (value >= last) {
                    ans += last - 1;
                    last--;
                } else {
                    ans += value;
                    last = value;
                }
            }
            System.out.println(ans);
        }
    }

}
