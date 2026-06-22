package Rated_1600_questions;

import java.util.*;
public class ShockingArrangement {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            boolean hasAllZero = true;
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                if(a[i] != 0) hasAllZero = false;
            }

            if(hasAllZero){
                System.out.println("No");
            } else{
                System.out.println("Yes");
                ArrayList<Integer> pos = new ArrayList<>();
                ArrayList<Integer> neg = new ArrayList<>();
                int[] ans = new int[n];
                for(int num : a){
                    if(num >= 0) pos.add(num);
                    else{
                        neg.add(num);
                    }
                }
                int sum = 0;
                for(int i = 0; i<n; i++){
                    if(sum <= 0 && !pos.isEmpty()){
                        ans[i] = pos.removeLast();
                    } else{
                        ans[i] = neg.removeLast();
                    }
                    sum += ans[i];
                }

                for(int i=0;i<n;i++){
                    System.out.print(ans[i] + " ");
                }
            }

        }
    }

}
