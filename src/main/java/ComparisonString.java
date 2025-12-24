import java.util.*;

public class ComparisonString {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();

            int ans = 1;
            int curr = 1;
            for(int i=1;i<n;i++){
                if(s.charAt(i) == s.charAt(i-1)){
                    curr++;
                } else{
                    ans = Math.max(ans,curr);
                    curr=1;
                }
            }
            ans = Math.max(ans,curr);
            System.out.println(ans+1);
        }
    }

}
