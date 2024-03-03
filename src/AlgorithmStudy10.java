import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmStudy10 // 백준 1238
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt(), X = sc.nextInt();

        int[][] dist = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++)
            Arrays.fill(dist[i], 1000000);

        for (int i = 0; i < M; i++) {
            int n1 = sc.nextInt(), n2 = sc.nextInt(), t = sc.nextInt();
            dist[n1][n2] = t;
        }


        for (int k = 1; k <= N; k++)
            for (int i = 1; i <= N; i++)
                for (int j = 1; j <= N; j++)
                    if (dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];
        int ans = 0;
        for (int i = 1; i <= N; i++)
            if (i != X)
                ans = Math.max(ans, dist[i][X] + dist[X][i]);

        System.out.println(ans);


    }
}
