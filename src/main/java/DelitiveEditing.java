import java.util.*;

public class DelitiveEditing {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            String s = sc.next();
            String t = sc.next();

            if(s.equals(t)){
                System.out.println("YES");
            } else if(s.length()<t.length()){
                System.out.println("NO");
            } else{
                int x = s.length();
                int y = t.length();

                StringBuilder sb = new StringBuilder();
                int[] freq = new int[26];
                for(int i=0;i<y;i++){
                    freq[t.charAt(i)-'A']++;
                }

                for(int i=x-1;i>=0;i--){
                    if(freq[s.charAt(i)-'A']>0){
                        freq[s.charAt(i)-'A']--;
                        sb.append(s.charAt(i));
                    }
                }
                String finalString = sb.reverse().toString();
                if(finalString.equals(t)){
                    System.out.println("YES");
                } else{
                    System.out.println("NO");
                }
            }
        }
    }

}
