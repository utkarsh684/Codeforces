package Rated_1300_questions;
import java.util.Scanner;

public class SimpleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        char[] ans = new char[n];
        ans[0] = s.charAt(0);
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == ans[i - 1]) {
                for (char j = 'a'; j <= 'z'; j++) {
                    if (j != s.charAt(i - 1)) {
                        if (i < n - 1 && j != s.charAt(i + 1)) {
                            ans[i] = j;
                            break;
                        } else if (i == n - 1) {
                            ans[i] = j;
                            break;
                        }
                    }
                }
            } else {
                ans[i] = s.charAt(i);
            }
        }
        System.out.println(new String(ans));
    }
}
