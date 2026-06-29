package Rated_1100_questions;

import java.util.*;
public class DifferenceOfGCDS {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long l = sc.nextInt();
            long r = sc.nextInt();
            List<Long> a = new ArrayList<>();
            boolean check = true;

            for(int i=1;i<=n;i++){
                long mul = ((l+i-1)/i)*i;
                a.add(mul);
                if(mul>r){
                    check = false;
                    break;
                }
            }

            if(check){
                System.out.println("YES");
                for(long e : a){
                    System.out.print(e + " ");
                }
                System.out.println();
            }else{
                System.out.println("NO");
            }
        }
    }

}
