import java.util.*;

public class Chaneka {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            Set<Pair> set1 = new HashSet<Pair>();
            Set<Pair> set2 = new HashSet<Pair>();
            set1.add(new Pair(x1+a, y1+b));
            set1.add(new Pair(x1-a, y1+b));
            set1.add(new Pair(x1+a, y1-b));
            set1.add(new Pair(x1-a, y1-b));
            set1.add(new Pair(x1+b, y1+a));
            set1.add(new Pair(x1-b, y1+a));
            set1.add(new Pair(x1+b, y1-a));
            set1.add(new Pair(x1-b, y1-a));

            set2.add(new Pair(x2+a, y2+b));
            set2.add(new Pair(x2-a, y2+b));
            set2.add(new Pair(x2+a, y2-b));
            set2.add(new Pair(x2-a, y2-b));
            set2.add(new Pair(x2+b, y2+a));
            set2.add(new Pair(x2-b, y2+a));
            set2.add(new Pair(x2+b, y2-a));
            set2.add(new Pair(x2-b, y2-a));

            set2.retainAll(set1);
            System.out.println(set2.size());

        }
    }
    static class Pair {
        int x;
        int y;

        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return x == pair.x && y == pair.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
