import java.util.*;

public class MakeItDivisibleBy25 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            List<String> ls = Arrays.asList("00", "25", "50", "75");
            long ans = Long.MAX_VALUE;

            for(String possibleValue : ls){
                ans = Math.min(ans, helper(s, possibleValue));
            }
            System.out.println(ans);
        }
    }

    public static long helper(String s, String value){
        long operations = 0;
        int checkIndex = value.length()-1;

        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i) == value.charAt(checkIndex)){
                checkIndex--;
                if(checkIndex<0){
                    break;
                }
            }
            else{
                operations++;
            }

        }

        return operations;
    }

}
