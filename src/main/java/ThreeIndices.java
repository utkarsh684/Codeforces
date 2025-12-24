import java.util.*;

public class ThreeIndices {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i=0;i<n;i++){
                nums[i] = sc.nextInt();
            }
            int i1 = -1, i2 = -1, i3 = -1;
            boolean flag = false;
            for(int i=1;i<nums.length-1;i++){
                int j = -1;
                int k = -1;
                for(int left = 0;left<i;left++){
                    if(nums[left]<nums[i]){
                        j = left;
                        break;
                    }
                }

                for(int right = i+1;right<nums.length;right++){
                    if(nums[right]<nums[i]){
                        k = right;
                        break;
                    }
                }

                if(j!=-1 && k!=-1){
                    System.out.println("YES");
                    System.out.println((j+1)+" "+(i+1)+" "+(k+1));
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println("NO");
            }
        }
    }

}
