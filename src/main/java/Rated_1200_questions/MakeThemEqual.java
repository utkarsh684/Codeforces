package Rated_1200_questions;

import java.util.*;
public class MakeThemEqual {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            char ch = sc.next().charAt(0);
            String s = sc.next();

            boolean isZeroRequired = true;

            for(char c : s.toCharArray()){
                if(c != ch){
                    isZeroRequired = false;
                    break;
                }
            }

            if(isZeroRequired){
                System.out.println("0");
                continue;
            }

            int ansByOneOperation = -1;
            for(int i=2;i<=n;i++){
                boolean isOneRequired = true;

                for(int j=i;j<=n;j+=i){
                    if(s.charAt(j-1) != ch){
                        isOneRequired = false;
                        break;
                    }
                }

                if(isOneRequired){
                    ansByOneOperation = i;
                    break;
                }
            }

            if(ansByOneOperation != -1){
                System.out.println("1");
                System.out.println(ansByOneOperation);
                continue;
            }

            System.out.println("2");
            System.out.println((n - 1) + " " + n);
        }
    }

}
