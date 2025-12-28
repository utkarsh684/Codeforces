package contest;

import java.util.*;
import java.io.*;
public class YesOrYes {

    public static void main(String args[]) throws IOException {
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();
        while(t-->0){
            String s = fs.next();

            boolean isMoreThanOne = false;
            int ones = 0;
            for(char ch : s.toCharArray()){
                if(ch == 'Y'){
                    ones++;
                }

                if(ones>1){
                    isMoreThanOne = true;
                    break;
                }
            }

            if(isMoreThanOne){
                System.out.println("NO");
            } else {
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
