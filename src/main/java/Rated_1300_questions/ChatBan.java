package Rated_1300_questions;

import java.util.*;
public class ChatBan {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long k = sc.nextLong();
            long x = sc.nextLong();

            long low = 1;
            long high = 2*k-1;
            long ans = 2*k-1;
            while(low<=high){
                long mid = low+(high-low)/2;
                long count;

                if(mid>=k){
                    count = fun(k)+fun(k-1)-fun(2*k-1 - mid);
                } else{
                    count = fun(mid);
                }

                if(count >= x){
                    ans = mid;
                    high = mid-1;
                }else {
                    low = mid+1;
                }
            }
            System.out.println(ans);
        }
    }

    public static long fun(long k){
        return k*(k+1)/2;
    }

}
