import java.util.*;

public class PermutationSwap {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] nums = new int[n];
            int sum = 0;
            for(int i=0;i<n;i++){
                nums[i] = sc.nextInt();
                sum += nums[i];
            }
            int[] prefix = new int[n+1];
            for(int i=1;i<=n;i++){
                prefix[i] = prefix[i-1] + nums[i-1];
            }
            while(q-->0){
                int l = sc.nextInt();
                int r = sc.nextInt();
                int k = sc.nextInt();
                int remove = prefix[r] - prefix[l-1];
                int add = (r-l+1)*k;
                int temp = sum-remove+add;

                if(temp%2==0){
                    System.out.println("No");
                } else{
                    System.out.println("Yes");
                }
            }
        }
    }
}
