import java.util.Scanner;

public class GreedyAlgorithm1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        int[] coinValues = new int[N];

        for (int i = 0; i < N; i++) {
            coinValues[i] = input.nextInt();
        }

        int[] dp = new int[K + 1];
        for (int i = 1; i <= K; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int coin : coinValues) {
                if (i >= coin) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        System.out.println(dp[K]);
    }
}
