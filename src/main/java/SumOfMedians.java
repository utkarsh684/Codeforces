import java.util.*;

public class SumOfMedians {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] nums = new long[n*k];
            for(int i=0;i<n*k;i++){
                nums[i] = sc.nextLong();
            }

            long sum = 0;
            int x = n/2;
            for(int i=nums.length-1-x;i>=0;i=i-1-x){
                if(k<=0){
                    break;
                }
                sum += nums[i];
                k--;
            }
            System.out.println(sum);
        }
    }

}
