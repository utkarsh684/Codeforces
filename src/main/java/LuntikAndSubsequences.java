import java.util.*;

public class LuntikAndSubsequences {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] nums = new long[n];
            long ones = 0;
            long zeros = 0;
            for(int i=0;i<n;i++){
                nums[i] = sc.nextLong();
                if(nums[i] == 1){
                    ones++;
                }
                if(nums[i] == 0){
                    zeros++;
                }
            }
            long ans = (long)(ones*Math.pow(2,zeros));
            System.out.println(ans);
        }
    }

}

