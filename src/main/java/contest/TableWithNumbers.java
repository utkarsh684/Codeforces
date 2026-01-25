package contest;

import java.util.*;
public class TableWithNumbers {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int h = sc.nextInt();
            int l = sc.nextInt();

            int[] nums = new int[n];
            for(int i=0;i<nums.length;i++){
                nums[i] = sc.nextInt();
            }

            if(h!=l){
                int a = 0;
                int b = 0;

                for(int i=0;i<nums.length;i++){
                    if(nums[i]> Math.min(l,h) && nums[i] <= Math.max(l,h)){
                        a++;
                    } else if(nums[i]<=Math.min(l,h)){
                        b++;
                    }
                }
                System.out.println(Math.min(Math.min(a,b), n/2));
            } else{
                int a = 0;
                for(int i=0;i<nums.length;i++){
                    if(nums[i]<=Math.min(l,h)){
                        a++;
                    }
                }
                System.out.println(Math.min(a/2, n/2));
            }
        }
    }

}


