import java.util.*;
public class PredominantFrequencyDivision {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a =  new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int INF = 1_000_000_007;
            int min = INF;
            int[] prefix1 = new int[n+1];
            int[] prefix2 = new int[n+1];
            for(int i=0; i<n;i++){
                prefix1[i+1] = prefix1[i] + (a[i] == 1 ? 1 : -1);
                prefix2[i+1] = prefix2[i] + (a[i] == 3 ? -1 : 1);
            }
            boolean found = false;
            for(int i=1;i<n;i++){
                if(prefix2[i] - min >= 0){
                    found = true;
                    break;
                }
                if(prefix1[i] >= 0){
                    min = Math.min(min, prefix2[i]);
                }
            }
            if(found){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
