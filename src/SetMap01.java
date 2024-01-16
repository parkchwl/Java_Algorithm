import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SetMap01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] X = new int[N];

        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
        }

        int[] result = compress(N, X);

        Arrays.stream(result).forEach(value -> System.out.print(value + " "));
    }

    public static int[] compress(int N, int[] X) {
        int[] sortedX = X.clone();
        Arrays.sort(sortedX);

        Map<Integer, Integer> map = new HashMap<>();
        int value = 0;

        for (int x : sortedX) {
            map.putIfAbsent(x, value++);
        }

        return Arrays.stream(X)
                .map(map::get)
                .toArray();
    }
}
