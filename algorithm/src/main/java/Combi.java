import java.util.ArrayList;
import java.util.List;

public class Combi {
    static List<Integer> arr = List.of(1, 2, 3, 4, 5);
    static boolean[] visited = new boolean[5];
    static List<Integer> tmp = new ArrayList<>();
    static int count = 0;
    public static void main(String[] args) {
        combi(0);
        System.out.println(count);
    }

    public static void combi(int depth) {
        if (tmp.size() == 3) {
            for (Integer integer : tmp) {
                System.out.print(integer + " ");
            }
            System.out.println();
            count++;
            return;
        }
        for (int i = depth; i < arr.size(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                tmp.add(arr.get(i));
                combi(i+1);
                visited[i] = false;
                tmp.remove(tmp.size() - 1);
            }
        }
    }
}
