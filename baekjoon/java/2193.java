/*
 * n=2
 * 0 : 1, 0
 * 1 : 0
 * 
 * n=3
 * 0 : 00, 01, 10
 * 1 : 00, 01
 * 
 * dp 배열은 long처리를 하자!!!!!!!!!!!!!!!!!
 * 
 */
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] dp = new long[n+1][2];
		Arrays.fill(dp[1], 1);
		for(int i=2; i<=n; i++) {
			dp[i][0] = dp[i-1][0] + dp[i-1][1];
			dp[i][1] = dp[i-1][0];
		}
		
		System.out.println(dp[n][1]);
	}
}
