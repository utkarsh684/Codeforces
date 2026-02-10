package Rated_1200_questions;

import java.util.*;
public class DoraAndSearch {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            ArrayList<Integer> list = new ArrayList<>();

            for(int i=0;i<n;i++){
                if(arr[i] != (i+1)){
                    list.add(arr[i]);

                }
            }
        }
    }

}
