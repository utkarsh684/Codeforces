package contest;

import java.util.*;
public class FarmLegs {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            if(n %2 ==1){
                System.out.println(0);
            } else{
                long y = n/2;
                if(y%2==0){
                    System.out.println((y/2)+1);
                } else{
                    System.out.println((y+2-1)/2);
                }
            }
        }
    }

}
