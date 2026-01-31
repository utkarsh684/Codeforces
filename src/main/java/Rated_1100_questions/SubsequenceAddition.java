package Rated_1100_questions;

import java.util.*;
public class SubsequenceAddition {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] c = new long[n];
            for(int i=0;i<n;i++){
                c[i] = sc.nextInt();
            }
            Arrays.sort(c);

            if(c[0] != 1){
                System.out.println("NO");
            } else{
                boolean notPossible  = false;
                long sum = 1;
                for(int i=1;i<n;i++){
                    if(c[i] > sum){
                        notPossible = true;
                        break;
                    }
                    sum += c[i];
                }
                if(notPossible){
                    System.out.println("NO");
                } else{
                    System.out.println("YES");
                }
            }
        }
    }

}
