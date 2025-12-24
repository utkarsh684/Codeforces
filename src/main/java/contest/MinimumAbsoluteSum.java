package contest;

import java.util.*;
public class MinimumAbsoluteSum {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] nums = new long[n];
            for(int i=0;i<n;i++){
                nums[i] = sc.nextLong();
            }

            if(nums[0]==-1 && nums[n-1]==-1){
                nums[0]=0;
                nums[n-1]=0;
            } else if(nums[0]==-1 && nums[n-1]!=-1){
                nums[0]=nums[n-1];
            } else if(nums[0]!=-1 && nums[n-1]==-1){
                nums[n-1] = nums[0];
            }
            for(int i=1;i<n-1;i++){
                if(nums[i] == -1){
                    nums[i] = 0;
                }
            }
            long sum = 0;
            for(int i=1;i<nums.length;i++){
                sum+=nums[i]-nums[i-1];
            }
            System.out.println(sum);
            for(int i=0;i<nums.length;i++){
                System.out.print(nums[i]+" ");
            }
            System.out.println();
        }
    }

}
