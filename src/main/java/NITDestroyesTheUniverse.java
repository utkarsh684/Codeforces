import java.util.*;

public class NITDestroyesTheUniverse {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] nums = new long[n];
            for(int i=0;i<n;i++){
                nums[i] = sc.nextInt();
            }
            int count = 0;
            boolean isZeroFound = false;
            int left = 0;
            int right = n-1;
            for(int i=0;i<n;i++){
                if(nums[i] == 0){
                    count++;
                }
            }
            
            while(left<n && nums[left] == 0){
                left++;
            }
            
            while(right>=0 && nums[right] ==0){
                right--;
            }
            
            for(int i =left;i<right;i++){
                if(nums[i] == 0){
                    isZeroFound = true;
                    break;
                }
            }
            
            if(count == n){
                System.out.println(0);
            } else if (!isZeroFound) {
                System.out.println(1);
            } else{
                System.out.println(2);
            }
        }
    }

}
