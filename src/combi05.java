import java.util.Scanner;
 
public class combi05 {
 
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[][] dp = new int[30][30];
 
		for (int i = 0; i < 30; i++) {
			dp[i][i] = 1;
			dp[i][0] = 1;
		}
			
 
		for (int i = 2; i < 30; i++) {
			for (int j = 1; j < 30; j++) {
				dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
			}
		}
        
        
		
		int T = in.nextInt();
	
		StringBuilder sb = new StringBuilder();
        
		for(int i = 0; i < T; i++) {
 

			int N = in.nextInt();	// N = r
			int M = in.nextInt();	// M = n
			
			sb.append(dp[M][N]).append('\n');
		}
		
		System.out.println(sb);
 
	}
}