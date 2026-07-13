import java.util.*;
public class Bigrams {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int k = sc.nextInt();
            int[] c = new int[k];
            int count = 0;
            int count2=0;
            for(int i=0;i<k;i++){
                c[i] = sc.nextInt();
                if(c[i] >= 2) count++;
                if(c[i] > 2) count2=1;
            }
            if(count>=2)
                System.out.println("YES");
            else if (count2 ==1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

}
