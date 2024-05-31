import java.io.*;
import java.util.*;

public class AlgorithmLecture {
    static int n,m,k;
    static char[][] grid;
    static int[][] dp;
    static int [] dr = {1, 0, -1, 0};
    static int [] dc = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        grid = new char[n][m];
        dp = new int[n][m];

        for (int i = 0; i < n; i++) {
            grid[i] = br.readLine().toCharArray();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[j][i] == 'O') {
                    dp[i][j] = 1;
                }
            }
        }

        boolean changed = true;
        while (changed){
            changed = false;
            int[][] newDp = new int[n][m];
            for(int i = 0; i < n; i++){
                newDp[i] = dp[i].clone();
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (dp[i][j] == 0 && Adjcnt(i, j) >= 2) {
                        newDp[i][j] = 1;
                        changed = true;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                dp[i] = newDp[i].clone();
            }
    }
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dp[i][j] == 1){
                    result ++;
                }
            }
        }

        System.out.println(result);
    }
    private static int Adjcnt (int r, int c){
        int count = 0;
        for (int i = 0; i < 4; i++){
                int newR = r + dr [i];
                int newC = c + dc [i];
                if (newR >= 0 && newR < n && newC >= 0 && newC < m){
                    count++;
                }
        }

        return count;
    }

}