package Rated_1100_questions;

import java.util.*;
public class CollectingGame {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long a[] = new long[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }

            List<Pair> list = new ArrayList<>();
            long[] prefixSum = new long[n];

            for(int i=0;i<n;i++){
                list.add(new Pair(a[i], i));
            }

            list.sort(Comparator.comparingLong(pair -> pair.first));

            prefixSum[0] = list.getFirst().first;
            for(int i=1;i<n;i++){
                prefixSum[i] = prefixSum[i-1]+list.get(i).first;
            }

            long[] ans = new long[n];

            for(int i=0;i<n;i++){
                long toFind = prefixSum[i];
                int j = i;
                int e = n-1;
                int idx = i;
                while(j<=e){
                    int mid = j+(e-j)/2;
                    if(list.get(mid).first > toFind){
                        e = mid - 1;
                    } else if(list.get(mid).first <= toFind){
                        idx = mid;
                        j = mid + 1 ;
                    }
                }
                ans[i] = idx;
            }

            for (int i = n - 2; i >= 0; i--) {
                if (prefixSum[i] >= list.get(i + 1).first) {
                    ans[i] = ans[i + 1];
                }
            }

            long[] finalAns = new long[n];
            for (int i = 0; i < n; i++) {
                finalAns[list.get(i).second] = ans[i];
            }


            for(int i=0;i<n;i++){
                System.out.print(finalAns[i] +" ");
            }
            System.out.println();
        }
    }

    static class Pair{
        long first;
        int second;

        Pair(long first, int second){
            this.first = first;
            this.second = second;
        }
    }

}
