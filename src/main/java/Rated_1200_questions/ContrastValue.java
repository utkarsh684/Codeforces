package Rated_1200_questions;

import java.util.*;
public class ContrastValue {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            List<Long> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(sc.nextLong());
            }

            List<Long> result = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (i == 0 || !list.get(i).equals(list.get(i-1))) {
                    result.add(list.get(i));
                }
            }

            int m = result.size();
            if (m <= 2) {
                System.out.println(m);
                continue;
            }

            int ans = 2;

            for (int i = 1; i < m - 1; i++) {
                long prev = result.get(i - 1);
                long curr = result.get(i);
                long next = result.get(i + 1);

                if ((prev < curr && curr > next) ||
                        (prev > curr && curr < next)) {
                    ans++;
                }

            }

            System.out.println(ans);
        }
    }

}
