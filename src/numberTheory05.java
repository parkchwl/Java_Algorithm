import java.util.Scanner;

public class numberTheory05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int sum = 0;
        int minPrime = -1;
        boolean found = false;

        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;

                if (!found || i < minPrime) {
                    minPrime = i;
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(minPrime);
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
