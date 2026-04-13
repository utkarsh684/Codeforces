package Rated_1300_questions;

import java.util.*;
public class DivisiblePairs {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long x = sc.nextLong();
            long y = sc.nextLong();

            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
            }
            Map<Long, Integer> map = new HashMap<>();
            long ans = 0;

            for (int i = 0; i < n; i++) {
                long a = arr[i];

                long rx = a % x;
                long ry = a % y;

                long needX = (x - rx) % x;

                long keyNeed = needX * (long)1e9 + ry;

                if (map.containsKey(keyNeed)) {
                    ans += map.get(keyNeed);
                }

                long key = rx * (long)1e9 + ry;
                map.put(key, map.getOrDefault(key, 0) + 1);
            }

            System.out.println(ans);
        }
        }
    }