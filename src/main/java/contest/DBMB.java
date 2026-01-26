package contest;

import java.util.*;
public class DBMB {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int s = sc.nextInt();
            int x = sc.nextInt();

            int[] nums = new int[n];
            int sum = 0;
            for(int i=0;i<nums.length;i++){
                nums[i] = sc.nextInt();
                sum += nums[i];
            }

            int diff = s-sum;
            if(diff <0){
                System.out.println("NO");
            } else if (diff == 0) {
                System.out.println("YES");
            } else {
                if(diff%x==0){
                    System.out.println("YES");
                } else{
                    System.out.println("NO");
                }
            }
        }
    }

}
