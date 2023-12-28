import java.util.Scanner;

public class AlgorithmClass06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long n = scanner.nextLong();
        Long res = Long.valueOf(0);
        Long a = Long.valueOf(0);
        for (int i = 1; i <= n-2; i++) {
            a += i;
            res += a;
        }

        System.out.println(res);
        System.out.println(3);
    }

}