package Rated_1300_questions;
import java.util.Scanner;

public class MoveAndTurn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int k = n / 2;

        long ans = 0;

        if (n % 2 == 0) {
            ans = (long) (k + 1) * (k + 1);
        } else {
            ans = 2L * (k + 1) * (k + 2);
        }

        System.out.println(ans);
    }

}
