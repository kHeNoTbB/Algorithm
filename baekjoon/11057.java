import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[][] dp = new int[n+1][10];
		
		Arrays.fill(dp[1], 1);

		int A = 10007;
		for(int i=2; i<=n; i++) {
			for(int j=0; j<10; j++) {
				for(int k=0; k<=j; k++) {
					dp[i][j] += dp[i-1][k] % A;
				}
			}
		}
		long answer = 0;
		for(int i=0; i<10; i++) answer += dp[n][i];
		System.out.print(answer%A);
	}
}
