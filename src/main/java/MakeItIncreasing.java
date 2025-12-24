import java.util.*;

public class MakeItIncreasing {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] nums = new long[n];
            for(int i=0;i<n;i++){
                nums[i] = sc.nextLong();
            }
            int ans = 0;
            long prev = nums[n-1];
            boolean cannotBeCalculated = false;
            int freq = 0;
            for(int i=n-2;i>=0;i--){
                while(nums[i]>=prev){
                    nums[i]/=2;
                    ans++;
                    if(nums[i] == 0 && freq == 1){
                        cannotBeCalculated = true;
                        break;
                    } else if(nums[i] == 0 && freq == 0){
                        freq++;
                    }
                }
                if(cannotBeCalculated){
                    break;
                }
                prev = nums[i];
            }
            if(cannotBeCalculated){
                System.out.println(-1);
            }
            else{
                System.out.println(ans);
            }
        }
    }

}
