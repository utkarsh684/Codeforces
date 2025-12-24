// this the 900 rated question of cp 31 sheet "multiply by 2 and divide by 6"

import java.util.*;
public class B1374 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            if(n == 1){
                System.out.println(0);
            } else if(n%3 != 0){
                System.out.println(-1);
            } else{
                boolean flag = true;
                int ans = 0;
                while(n!=1){
                    if(n%6 == 0){
                        n=n/6;
                        ans++;
                    } else if(n%3 == 0){
                        n=n*2;
                        ans++;
                    } else {
                        flag = false;
                        break;
                    }
                }
                if(!flag){
                    System.out.println(-1);
                } else{
                    System.out.println(ans);
                }
            }
        }
    }

}
