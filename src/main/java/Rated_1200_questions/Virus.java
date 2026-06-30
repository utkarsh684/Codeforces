package Rated_1200_questions;

import java.util.*;
public class Virus {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[m];
            for(int i=0;i<m;i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            List<Integer> gaps = new ArrayList<>();
            for(int i=0;i<m-1;i++){
                gaps.add(a[i+1]-a[i]-1);
            }
            gaps.add(a[0] + n - a[m-1] - 1);
            Collections.sort(gaps, Collections.reverseOrder());
            int saved = 0;
            int days = 0;
            for(int gap : gaps){
                int currGap = gap - 2*days;
                if(currGap > 0){
                    saved ++;
                    currGap -= 2;
                    if(currGap > 0){
                        saved += currGap;
                    }
                    days += 2;
                }
            }
            System.out.println(n-saved);
        }
    }

}
