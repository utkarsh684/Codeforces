import java.util.*;

public class OldGrasshopper {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long x = sc.nextLong();
            long n = sc.nextLong();

            long finalPos;

            if(n%4==1){
                finalPos = -n;
            } else if(n%4==2){
                finalPos = 1;
            } else if(n%4==3){
                finalPos = n+1;
            } else{
                finalPos=0;
            }

            if (x % 2 == 0) {
                finalPos = x + finalPos;
            } else {
                finalPos = x - finalPos;
            }

            System.out.println(finalPos);
        }
    }

}
