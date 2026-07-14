import java.util.*;
public class ABitOdd {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int left = 0, right = n-1;
            while(left<n && s.charAt(left) == '0') left++;
            while(right>=0 && s.charAt(right) == '1') right--;
            if(left>right){
                System.out.println("Bob");
                continue;
            }
            int count = 1;
            int possible = 1;
            for(int i=left; i<right ;i++){
                if(s.charAt(i+1) == s.charAt(i)){
                    count++;
                }
                else{
                    if(count%2==1) possible = 0;
                    count = 1;
                }
            }
            if(count%2==1)possible = 0;
            System.out.println(possible == 1 ? "Bob" : "Alice");
        }
    }

}
