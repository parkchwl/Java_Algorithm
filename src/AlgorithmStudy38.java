//BOJ 11727 2xn 타일링 2
import java.util.Scanner;

public class AlgorithmStudy38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 3;
        for (int i = 3; i <= n; i++)
            dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007;

        System.out.println(dp[n]);
    }
}