import java.util.Scanner;

public class AlgorithmStudy37 {
    public static void Main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int[N + 1];
        int[] cards = new int[N + 1];

        for (int i = 1; i <=N; i++){
            cards[i] = sc.nextInt();
            for (int j = 1; j<=i; j++){
                dp[i] = Math.max(dp[i], dp[i - j] + cards[j]);
            }
        }
        System.out.println(dp[N]);
    }
}