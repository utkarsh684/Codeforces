package Rated_1400_questions;

import java.util.*;
public class Dances {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            a[0] = 1;
            List<Integer> b = new ArrayList<>();
            for(int i=1;i<n;i++){
                a[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                b.add(sc.nextInt());
            }
            Arrays.sort(a);
            Collections.sort(b);
            for(int i=0;i<n;i++){
                int target = a[i];
                int at = upperBound(b, target);
                if(at>=b.size()){
                    continue;
                } else{
                    b.remove(at);
                }
            }
            System.out.println(b.size());
        }
    }

    public static int upperBound(List<Integer> list, int target) {
        int low = 0;
        int high = list.size();

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (list.get(mid) <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
