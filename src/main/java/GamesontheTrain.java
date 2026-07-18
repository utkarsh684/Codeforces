import java.util.*;
public class GamesontheTrain {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                int x = sc.nextInt();
                if(x<min){
                    min = x;
                }
                if(x>max){
                    max = x;
                }
            }
            System.out.println((max+1)-min);
        }
    }

}
