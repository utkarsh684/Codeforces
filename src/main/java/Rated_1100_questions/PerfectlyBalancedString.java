package Rated_1100_questions;

import java.util.*;
public class PerfectlyBalancedString {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            Set<Character> st = new HashSet<>();
            int k;
            for(k=0;k<s.length();k++){
                if(!st.contains(s.charAt(k))){
                    st.add(s.charAt(k));
                } else{
                    break;
                }
            }
            boolean no = false;
            for(int i=k;i<s.length();i++){
                if(s.charAt(i) != s.charAt(i-k)){
                    System.out.println("NO");
                    no = true;
                    break;
                }
            }
            if(!no){
                System.out.println("YES");
            }

        }
    }

}
