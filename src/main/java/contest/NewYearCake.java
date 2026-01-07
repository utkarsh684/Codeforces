package contest;

import java.util.*;
public class NewYearCake {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();

            long ans1 = simulate(a, b, true);
            long ans2 = simulate(a, b, false);

            System.out.println(Math.max(ans1,ans2));
        }
    }

    static int simulate(long white, long dark, boolean startWhite) {
        long size = 1;
        int layers = 0;
        boolean isWhite = startWhite;

        while (true) {
            if (isWhite) {
                if (white < size) break;
                white -= size;
            } else {
                if (dark < size) break;
                dark -= size;
            }

            layers++;
            size *= 2;
            isWhite = !isWhite;
        }
        return layers;
    }


}
