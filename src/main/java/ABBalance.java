import java.util.*;

public class ABBalance {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int ab = 0;
            int ba = 0;

            int count1 = 0;
            int pos = 0;
            String sub1 = "ab";
            String sub2 = "ba";

            while ((pos = s.indexOf(sub1, pos)) != -1) {
                count1++;
                pos++;
            }

            int count2 = 0;
            int pos2 = 0;
            while ((pos2 = s.indexOf(sub2, pos2)) != -1) {
                count2++;
                pos2++;
            }

            StringBuilder sb = new StringBuilder(s);
            if(count1 == count2){
                System.out.println(s);
            }
            else if(count1>count2){
                sb.setCharAt(0,'b');
                System.out.println(sb.toString());
            }
            else {
                sb.setCharAt(0,'a');
                System.out.println(sb.toString());
            }

        }
    }

}
