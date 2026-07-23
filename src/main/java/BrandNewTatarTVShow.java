import java.util.*;
public class BrandNewTatarTVShow {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            List<Pair> ls = new ArrayList<>();
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            ls.add(new Pair(a[0], 1));
            for(int i=1;i<n;i++){
                if(a[i] == a[i-1]){
                    ls.getLast().second++;
                }else{
                    ls.add(new Pair(a[i], 1));
                }
            }
            boolean ans = false;

            while (!ls.isEmpty()) {
                if (ls.getLast().second % 2 == 0) {
                    ans = true;
                    break;
                }

                if (ls.size() == 1) {
                    ans = false;
                    break;
                }

                if (ls.getLast().first - ls.get(ls.size() - 2).first <= k) {
                    ans = true;
                    break;
                }

                ls.removeLast();
            }

            System.out.println(ans ? "YES" : "NO");
        }
    }

    static class Pair{
        int first;
        int second;
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }

}
