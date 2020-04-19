/*
 * n=1
 * 1, 2, 3, 4, 5, 6, 7, 8, 9
 * 
 * n=2
 * 0 : 1 (예외처리) -> 더할때는 여기 빼기
 * 1 : 0,2 (n=1의 0,2)
 * 2 : 1,3
 * 3 : 2,4
 * 4 : 3,5
 * 5 : 4,6
 * 6 : 7,8
 * 7 : 6,8
 * 8 : 7,9
 * 9 : 8 (예외처리)
 * 
 * n=3
 * 0 : n=2의 0 (여기 예외처리) -> 더할때는 여기 빼기
 * 1 : n=2의 0과 2
 * 2 : n=2의 아..!!!!
 * 9 : n=2의 8 (여기도 예외처리)
 */
import java.util.*;
public class 쉬운계단수 {
	static int A = 1000000000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] dp = new int[n+1][10];		
		Arrays.fill(dp[1], 1);
		for(int i=2; i<=n; i++) {
			for(int j=0; j<10; j++) {
				if(j==0) dp[i][j] = (dp[i-1][j+1])%A;
				else if(j==9) dp[i][j] = (dp[i-1][j-1])%A;
				else dp[i][j] = (dp[i-1][j+1] + dp[i-1][j-1])%A;
			}
		}
		long answer = 0;
		for(int i=1; i<10; i++) answer += dp[n][i];
		System.out.print(answer%A);
	}
}
