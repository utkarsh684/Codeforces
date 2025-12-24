package Rated_1000_questions;

import java.util.*;
public class Monsters {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            ArrayList<long[]> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                long x = sc.nextLong();
                list.add(new long[]{x, i+1});
            }

            for(long[] pair : list){
                if(pair[0]%k == 0){
                    pair[0]=k;
                } else{
                    pair[0] = pair[0]%k;
                }
            }

            list.sort((a,b) -> {
                if(a[0]!=b[0]){
                    return Long.compare(b[0],a[0]);
                } else{
                    return Long.compare(a[1],b[1]);
                }
            });

            for(long[] pair : list){
                System.out.print(pair[1]+" ");
            }

            System.out.println();
        }
    }

}
