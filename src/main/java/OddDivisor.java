import java.util.*;

public class OddDivisor {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            if(n%2==1){
                System.out.println("YES");
            } else{
                boolean ans = true;
                while(n>0){
                    if(n%2!=0){
                        break;
                    }
                    if(n==2){
                        ans = false;
                        break;
                    }
                    n=n/2;
                }
                if(!ans){
                    System.out.println("NO");
                } else{
                    System.out.println("YES");
                }
            }
        }
    }

}
