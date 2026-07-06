package Rated_1400_questions;

import java.util.*;
public class ArrangingTheSheep {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int numOfSheeps = 0;
            for(char ch : s.toCharArray()){
                if(ch == '*') numOfSheeps++;
            }
            if (numOfSheeps == 0) {
                System.out.println(0);
                continue;
            }
            int mid = numOfSheeps/2;
            int index = -1;
            int j = -1;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == '*') j++;
                if(j == mid) {
                    index = i;
                    break;
                }
            }
            mid = index;
            int num = 0;
            long ans = 0;
            for(int left = mid-1; left>=0; left--){
                if(s.charAt(left) == '*'){
                    ans += num;
                } else{
                    num++;
                }
            }
            num = 0;
            for(int right = mid+1; right<s.length(); right++){
                if(s.charAt(right) == '*'){
                    ans += num;
                } else{
                    num++;
                }
            }
            System.out.println(ans);
        }
    }

}
