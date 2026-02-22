package Rated_1200_questions;

import java.util.*;
public class PrinzessinderVerurteilung {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();

            String mex = "";
            for(char c = 'a';c<='z';c++){
                if(s.indexOf(c)==-1){
                    mex = String.valueOf(c);
                    break;
                }
            }

            for(char c = 'a'; c<='z';c++){
                for(char c1 = 'a';c1<='z';c1++){
                    String temp = ""+c+c1;
                    if(mex.isEmpty() && s.indexOf(temp)==-1){
                        mex = temp;
                    }
                }
            }

            for (char c1 = 'a'; c1 <= 'z'; c1++) {
                for (char c2 = 'a'; c2 <= 'z'; c2++) {
                    for (char c3 = 'a'; c3 <= 'z'; c3++) {
                        String temp = "" + c1 + c2 + c3;

                        if (mex.isEmpty() && s.indexOf(temp) == -1) {
                            mex = temp;
                        }
                    }
                }
            }

            System.out.println(mex);
        }
    }

}