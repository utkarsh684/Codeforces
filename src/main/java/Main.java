import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] nums = new long[n];
            for(int i=0;i<n;i++){
                nums[i] = sc.nextLong();
            }

            long ans = 0;
            long curr = 1;
            Arrays.sort(nums);
            for(int i=1;i<n;i++){
                if(nums[i]-nums[i-1] <= k){
                    curr++;
                } else{
                    ans = Math.max(ans,curr);
                    curr=1;
                }
            }
            ans = Math.max(ans,curr);
            System.out.println(n-ans);
        }
    }
}


