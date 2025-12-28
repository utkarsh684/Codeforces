package Rated_1000_questions;

import java.util.*;
import java.io.*;
public class ValerriAgainstEveryone {

    public static void main(String args[]) throws IOException {
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();
        while(t-->0){
            int n = fs.nextInt();
            long[] nums = new long[n];
            HashMap<Long, Integer> map = new HashMap<>();
            boolean isWrong = false;
            for(int i=0;i<nums.length;i++){
                nums[i] = fs.nextLong();
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            }

            for(Map.Entry<Long, Integer> entry : map.entrySet()){
                if(entry.getValue()>1){
                    isWrong = true;
                    break;
                }
            }
            if(!isWrong){
                System.out.println("NO");
            } else{
                System.out.println("YES");
            }

        }
    }
    private static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }
}
