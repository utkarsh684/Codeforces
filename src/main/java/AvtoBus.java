import java.util.*;

public class AvtoBus {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long m = sc.nextLong();
            if(m<4 || m%2==1){
                System.out.println(-1);
            } else{
                long min = (m+5)/6;
                long max = m/4;
                System.out.println(min+" "+max);
            }
        }
    }

}
