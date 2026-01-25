package contest;

import java.io.IOException;
import java.io.InputStream;

public class ASocialExperiment {

    public static void main(String args[]) throws IOException {
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();
        while(t-->0){
            long n = fs.nextLong();
            if(n<=3){
                System.out.println(n);
            } else if(n%2==0){
                System.out.println(0);
            } else{
                System.out.println(1);
            }
        }
    }
    static class FastScanner {
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        private final InputStream in = System.in;

        private int readByte() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        long nextLong() throws IOException {
            int c;
            do {
                c = readByte();
            } while (c <= ' ');

            boolean neg = false;
            if (c == '-') {
                neg = true;
                c = readByte();
            }

            long val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = readByte();
            }
            return neg ? -val : val;
        }

        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }
}
