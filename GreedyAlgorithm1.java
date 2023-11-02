import java.util.Scanner;

public class GreedyAlgorithm1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        int[] coinValues = new int[N]; // 동전의 가치를 저장하기 위한 배열 생성.

        for (int i = 0; i < N; i++) {   // N번 반복하면서 각 동전의 가치를 입력받고
            coinValues[i] = input.nextInt();    //coinValues 배열에 저장한다.
        }

        int[] dp = new int[K + 1];      // 동전 프로그래밍을 위한 dp 생성
        for (int i = 1; i <= K; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int coin : coinValues) {
                if (i >= coin) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1); //현재 금액 i를 만드는 데 필요한 최소 동전 수를 계산
                }
            }
        }

        System.out.println(dp[K]);
    }
}

