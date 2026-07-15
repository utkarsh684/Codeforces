import java.util.*;
public class IskanderandDrawings {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int longest = 0;
            int count = 0;
            for(int i=0;i<n;i++){
                if(s.charAt(i) == '#'){
                    count++;
                }
                else{
                    longest = Math.max(longest, count);
                    count = 0;
                }
            }
            longest = Math.max(longest, count);
            System.out.println((longest+1)/2);
        }
    }

}
