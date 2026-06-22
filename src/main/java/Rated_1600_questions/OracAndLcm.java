package Rated_1600_questions;

import java.util.*;
public class OracAndLcm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            int x = a[i];
            for(int j = 2; j*j<=x;j++){
                if(x%j == 0){
                    int cnt = 0;
                    while(x%j == 0){
                        x /=j;
                        cnt++;
                    }
                    map.putIfAbsent(j, new ArrayList<>());
                    map.get(j).add(cnt);
                }
            }
            if (x > 1) {
                map.putIfAbsent(x, new ArrayList<>());
                map.get(x).add(1);
            }
        }
        long ans = 1;
        for(int num : map.keySet()){
            ArrayList<Integer> ls = map.get(num);
            if(ls.size() < n-1){
                continue;
            }
            if(ls.size() < n){
                ls.add(0);
            }
            Collections.sort(ls);
            int power = ls.get(1);
            for (int i = 0; i < power; i++) {
                ans *= num;
            }
        }
        System.out.println(ans);
    }
}
