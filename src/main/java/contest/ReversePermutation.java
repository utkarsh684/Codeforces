package contest;

import java.util.*;
public class ReversePermutation {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] p =new int[n];
            for(int i=0;i<n;i++){
                p[i] = sc.nextInt();
            }

            int k = n;
            for(int i=0;i<n;i++){
                if(p[i] != k){
                    int idx = -1;
                    for(int j = i+1;j<n;j++){
                        if(p[j] == k){
                            idx = j;
                            break;
                        }
                    }
                    reverse(p, i, idx);
                    break;
                }else{
                    k--;
                }
            }

            for(int i=0;i<p.length;i++){
                System.out.print(p[i] +" ");
            }
            System.out.println();
        }
    }

    public static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }


}
