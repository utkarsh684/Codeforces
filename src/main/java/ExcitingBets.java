import java.util.*;

public class ExcitingBets {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextInt();
            long b = sc.nextInt();

            if(a == b){
                System.out.println(0+" "+0);
            } else{
                long gcd = a-b;
                long moves = Math.min(b%gcd, gcd-b%gcd);
                System.out.println(gcd+" "+moves);
            }
        }
    }

}
