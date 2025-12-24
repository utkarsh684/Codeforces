import java.util.Scanner;

public class Vasilije {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            int n = sc.nextInt();

            long[] nums = new long[n];
            for(int i=0;i<nums.length;i++){
                nums[i] = sc.nextLong();
            }

            long min = b;
            for(int i=0;i<nums.length;i++){
                min+=Math.min(nums[i], a-1);
            }
            System.out.println(min);
        }
    }

}
