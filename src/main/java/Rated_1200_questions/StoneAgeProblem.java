package Rated_1200_questions;

import java.util.*;
public class StoneAgeProblem {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        List<int[]> v = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            v.add(new int[]{sc.nextInt(), 0});
        }
        int[] globalVal = {0,-1};
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += v.get(i)[0];
        }
        for(int i=1;i<=q;i++){
            int x = sc.nextInt();

            if(x == 1){
                int ind = sc.nextInt();
                int val = sc.nextInt();

                ind--;
                if (v.get(ind)[1] > globalVal[1]) {
                    sum += (val - v.get(ind)[0]);
                } else {
                    sum += (val - globalVal[0]);
                }
                v.get(ind)[0] = val;
                v.get(ind)[1] = i;
            } else{
                int val = sc.nextInt();
                globalVal[0] = val;
                globalVal[1] = i;
                sum = (long) val * n;
            }
            System.out.println(sum);
        }
    }

}
