package Rated_1000_questions;

import java.util.*;
public class RedVsBlue {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int r = sc.nextInt();
            int b = sc.nextInt();

            StringBuilder sb = new StringBuilder();
            int length_red = r/(b+1);
            int extra_red = r%(b+1);

            for(int i=1;i<=b+1;i++){
                for(int j=0;j<length_red;j++){
                    sb.append('R');
                }

                if(extra_red > 0){
                    sb.append('R');
                    extra_red--;
                }

                if(i!=b+1){
                    sb.append('B');
                }
            }
            System.out.println(sb.toString());
        }
    }
}
