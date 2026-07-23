import java.util.*;
public class OmskProgrammers {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int ans = (int)1e18;
            int i = 0;
            while(a != b){
                if(b>a){
                    int temp = a;
                    a=b;
                    b=temp;
                }
                ans = Math.min(ans, Math.abs(a-b)+i);
                a /= x;
                i++;
            }
            ans = Math.min(ans, i);
            System.out.println(ans);
        }
    }

}
