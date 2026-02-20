package Rated_1200_questions;

import java.util.*;
public class FlipTheBits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();

            boolean[] canFlipA = new boolean[n];

            int count1=0, count0=0;
            for(int i=0;i<n;i++){
                if(a.charAt(i) == '0'){
                    count0++;
                } else{
                    count1++;
                }

                if(count0 == count1){
                    canFlipA[i] = true;
                }
            }

            boolean isFlipped = false;
            boolean isPossible = true;

            for(int i=n-1;i>=0;i--){
                if(!isFlipped){
                    if(a.charAt(i) != b.charAt(i)){
                        if(canFlipA[i]){
                            isFlipped = !isFlipped;
                        } else{
                            isPossible = false;
                            break;
                        }
                    }
                } else{
                    if(a.charAt(i) == b.charAt(i)){
                        if(canFlipA[i]){
                            isFlipped = !isFlipped;
                        } else{
                            isPossible = false;
                            break;
                        }
                    }
                }
            }

            if(isPossible){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}