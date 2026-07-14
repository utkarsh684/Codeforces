import java.util.*;
public class AnAlternativeWay {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i=0;i<n;i++) a[i] = sc.nextInt();
            for(int i=0;i<n;i++) b[i] = sc.nextInt();
            long prefA = 0;
            long prefB = 0;
            boolean ok = true;
            for(int i = 0; i < n; i++){
                prefA += a[i];
                prefB += b[i];

                if(prefA > prefB){
                    ok = false;
                    break;
                }
            }
            System.out.println(ok ? "YES" : "NO");
        }
    }

}
