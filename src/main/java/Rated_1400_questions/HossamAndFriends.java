package Rated_1400_questions;

import java.util.*;
public class HossamAndFriends {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] limit = new int[n + 1];
            Arrays.fill(limit, n + 1);

            for(int i=0;i<m;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();

                if(a > b){
                    int temp = a;
                    a = b;
                    b = temp;
                }

                limit[a] = Math.min(limit[a], b);
            }

            long ans = 0;
            int minRight = n + 1;

            for(int i=n;i>=1;i--){
                minRight = Math.min(minRight, limit[i]);
                ans += (minRight - i);
            }

            System.out.println(ans);
        }
    }
}
