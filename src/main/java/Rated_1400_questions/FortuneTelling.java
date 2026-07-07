package Rated_1400_questions;

import java.util.*;
public class FortuneTelling {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long x = sc.nextLong();
            long y = sc.nextLong();
            int odds = 0;
            for(int i=0;i<n;i++){
                long a = sc.nextLong();
                if(a%2==1) odds++;
            }
            int aliceStart = (int) (x & 1L);
            int bobStart = 1 - aliceStart;

            int aliceEnd, bobEnd;
            if ((odds & 1) == 0) {
                aliceEnd = aliceStart;
                bobEnd = bobStart;
            } else {
                aliceEnd = 1 - aliceStart;
                bobEnd = 1 - bobStart;
            }
            if(((int) y&1L) == aliceEnd){
                System.out.println("Alice");
            } else{
                System.out.println("Bob");
            }
        }
    }

}
