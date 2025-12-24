import  java.util.*;

public class NotDividing {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] nums = new long[n];
            for(int i=0;i<n;i++){
                nums[i] = sc.nextLong();
            }

            for(int i = 0;i<n;i++){
                if(nums[i] == 1){
                    nums[i]++;
                }
            }

            for(int i=0;i<n-1;i++){
                if(nums[i+1]%nums[i]==0){
                    nums[i+1]++;
                }
            }

            for(int i=0;i<n;i++){
                System.out.print(nums[i]+" ");
            }
        }
    }
}
