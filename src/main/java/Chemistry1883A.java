import java.util.*;

public class Chemistry1883A {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            HashMap<Character, Integer> map = new HashMap<>();
            int count = 0;
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch,0)+1);
            }

            for(int value : map.values()){
                if(value%2==1){
                    count++;
                }
            }
            if(k == 0 && count>1){
                System.out.println("No");
            } else if (count>k && (count-k)>=2){
                System.out.println("No");
            } else{
                System.out.println("Yes");
            }
        }
    }
}
