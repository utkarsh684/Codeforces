package contest;

import java.util.*;
import java.io.*;
public class ImpostOrSus {

    public static void main(String args[]) throws IOException {
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();
        while(t-->0){
            String r = fs.next();

            int ans = 0;
            StringBuilder sb = new StringBuilder(r);
            if(r.charAt(0) == 'u'){
                sb.setCharAt(0, 's');
                ans++;
            }
            if(r.charAt(r.length()-1) == 'u'){
                sb.setCharAt(r.length()-1, 's');
                ans++;
            }

            int curr = 0;
            for(int i=1;i<sb.length();i++){
                if(sb.charAt(i) == 'u'){
                    curr++;
                } else{
                    ans += curr/2;
                    curr = 0;
                }
            }

            System.out.println(ans);
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
