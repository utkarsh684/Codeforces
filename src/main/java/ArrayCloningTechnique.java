import java.util.*;

public class ArrayCloningTechnique {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int nn = sc.nextInt();
            long[] nums = new long[nn];
            for(int i=0;i<nums.length;i++){
                nums[i] = sc.nextLong();
            }
            Arrays.sort(nums);
            long longest = nums[0];
            long max = 1;
            long curr = 1;
            for(int i=1;i<nums.length;i++){
                if(nums[i]==nums[i-1]){
                    curr++;
                } else{
                    curr = 1;
                }

                if(curr>max){
                    max = curr;
                    longest = nums[i];
                }
            }
            long m = max;
            long n = nn - m;
            long temp = n;
            long count = 0;
            while(m<nn){
                n=n-m;
                m=m*2;
                count++;
            }
            long ans = count+temp;
            System.out.println(ans);
        }
    }

}
