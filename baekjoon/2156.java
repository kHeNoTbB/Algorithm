import java.util.*;

public class Main {
	static int[] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] cost = new int[N + 1];
		dp = new int[N + 1];
		for (int n = 1; n <= N; n++) {
			cost[n] = sc.nextInt();
		}
		if (N <3 ) {
			int answer = 0;
			for(int i=1; i<=N; i++) {
				answer+=cost[i];
			}
			System.out.println(answer);
			return;
		} else {
			dp[1] = cost[1];
			dp[2] = cost[1] + cost[2];
			for (int i = 3; i <= N; i++) {
				dp[i] = dp[i - 1];
				dp[i] = Math.max(dp[i], dp[i - 2] + cost[i]);
				dp[i] = Math.max(dp[i], dp[i - 3] + cost[i - 1] + cost[i]);
			}
		}
		System.out.println(dp[N]);
	}
}
