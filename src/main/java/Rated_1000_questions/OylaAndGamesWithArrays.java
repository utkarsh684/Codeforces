package Rated_1000_questions;

import java.util.*;
public class OylaAndGamesWithArrays {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long small = Long.MAX_VALUE;
            long sum = 0L;
            long secSmall = Long.MAX_VALUE;

            while(n-->0){
                int m = sc.nextInt();
                ArrayList<Long> list = new ArrayList<>();
                for(int i=0;i<m;i++){
                    list.add(sc.nextLong());
                }
                Collections.sort(list, Collections.reverseOrder());
                sum+=list.get(list.size()-2);
                secSmall = list.get(list.size()-2)<secSmall ? list.get(list.size()-2) : secSmall;
                small = list.getLast()<small ? list.getLast() : small;
            }

            sum = sum - secSmall;
            sum+=small;
            System.out.println(sum);
        }
    }

}
