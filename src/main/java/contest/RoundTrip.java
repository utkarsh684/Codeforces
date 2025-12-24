package contest;
import java.util.*;

public class RoundTrip {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int r = sc.nextInt();
            int x = sc.nextInt();
            int d = sc.nextInt();
            int n = sc.nextInt();
            String s = sc.next();

            int ans = 0;
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if(c == '1'){
                    ans++;
                    r=r-d;
                    if(r<0){
                        r=0;
                    }
                } else{
                    if(r<x){
                        ans++;
                        r=r-d;
                        if(r<0){
                            r=0;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }

}
