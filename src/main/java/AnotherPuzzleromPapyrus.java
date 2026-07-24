import java.util.*;

public class AnotherPuzzleromPapyrus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int c = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                b[i] = sc.nextInt();
            }
            boolean needReorder = false;
            int ans = 0;
            int ans2 = 0;
            for(int i=0;i<n;i++){
                if(a[i]<b[i]){
                    needReorder = true;
                }
            }
            boolean possible = true;
            if(!needReorder){
                for(int i=0;i<n;i++){
                    ans2 += a[i]-b[i];
                }
            }
                ans += c;
                Arrays.sort(a);
                Arrays.sort(b);
                for(int i=0;i<n;i++){
                    if(a[i] >= b[i]){
                        ans += a[i]-b[i];
                    }else {
                        possible = false;
                        break;
                    }
                }
            if(possible && needReorder){
                System.out.println(ans);
            } else if (possible && !needReorder) {
                System.out.println(Math.min(ans, ans2));
            } else {
                System.out.println("-1");
            }
        }
    }
}
