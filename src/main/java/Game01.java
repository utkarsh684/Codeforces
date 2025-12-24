import java.util.*;
public class Game01 {

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();

            int countOfOne = 0;
            int countOfZero = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    countOfZero++;
                } else {
                    countOfOne++;
                }
            }
            int operations = Math.min(countOfZero, countOfOne);
            if (operations % 2 != 0) {
                System.out.println("DA");
            } else {
                System.out.println("NET");
            }
        }
    }

}
