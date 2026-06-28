package Rated_1700_questions;

import java.util.*;
public class TrainingSession {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            HashMap<Integer, Integer> map1 = new HashMap<>();
            HashMap<Integer, Integer> map2 = new HashMap<>();
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                b[i] = sc.nextInt();
                map1.put(a[i], map1.getOrDefault(a[i], 0)+1);
                map2.put(b[i], map2.getOrDefault(b[i], 0)+1);
            }
            long ans = (long) n *(n-1)*(n-2)/6;

            for(int i=0;i<n;i++){
                int x = map1.get(a[i])-1;
                int y = map2.get(b[i])-1;
                ans -= (long) x *y;
            }
            System.out.println(ans);
        }
    }

}
