package contest;

import java.util.*;
import java.io.*;
public class NewYearString {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();

            String sub = "2026";
            String sub2 = "2025";

            if(s.indexOf(sub) != -1){
                System.out.println(0);
            } else if(s.indexOf(sub2) == -1){
                System.out.println(0);
            } else if(s.indexOf(sub2) != -1){
                System.out.println(1);
            } else if (s.indexOf(sub) == -1 && s.indexOf(sub2) == -1) {
                System.out.println(0);
            }
        }
    }


}
