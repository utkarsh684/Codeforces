import java.util.*;

public class MochaAndMath {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long nums[] = new long[n];
            for(int i=0;i<n;i++){
                nums[i] = sc.nextLong();
            }

            long ans = nums[0];
            for(int i=1;i<nums.length;i++){
                ans &= nums[i];
            }

            System.out.println(ans);
        }
    }

}
