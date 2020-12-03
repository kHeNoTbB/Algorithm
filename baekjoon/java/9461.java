/*
* dp 배열 long 형으로 !!!!!!!!
*/
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();
			long[] dp = new long[N + 1];
			dp[0] = 0;
			if (N > 4) {
				dp[1] = 1;
				dp[2] = 1;
				dp[3] = 1;
				dp[4] = 2;
				for (int i = 5; i <= N; i++) {
					dp[i] = dp[i - 1] + dp[i - 5];
				}
				System.out.println(dp[N]);
			} else {
				System.out.println(N < 4 ? 1 : 2);
			}
		}
	}
}
