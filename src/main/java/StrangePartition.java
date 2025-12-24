import java.util.*;

public class StrangePartition {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long x = sc.nextLong();
            long[] nums = new long[n];
            long sum = 0;
            for(int i=0;i<n;i++){
                nums[i] = sc.nextLong();
                sum+=nums[i];
            }
            long min = (sum+x-1)/x;
            long max = 0;
            for(int i=0;i<n;i++){
                max += (nums[i]+x-1)/x;
            }
            System.out.println(min+" "+max);
        }
    }

}
