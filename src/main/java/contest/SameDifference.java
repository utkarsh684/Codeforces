package contest;

import java.util.*;
public class SameDifference {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();

            int ans = 0;
            char c = s.charAt(n-1);
            for(int i=n-2;i>=0;i--){
                if(s.charAt(i)!=c){
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }

}
