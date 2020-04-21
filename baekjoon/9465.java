/*
 * scanner 썼을 때 : 287388KB / 1440ms
 * bufferedReader 썼을 때 : 123796KB / 652ms
 * bufferedReader + StringBuilder : 123884KB / 776ms
 */
import java.util.*;
import java.io.*;
public class 스티커 {
	static int[][] dp, cost;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int t=0; t<T; t++) {
			int c = Integer.parseInt(br.readLine());
			cost = new int[2][c];
			for(int i=0; i<2; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<c; j++) {
					cost[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			dp = new int[2][c];
			for(int i=0; i<c; i++) {
				dp[0][i] = Math.max(isTrue(1, i-1), isTrue(1, i-2)) + cost[0][i];
				dp[1][i] = Math.max(isTrue(0, i-1), isTrue(0, i-2)) + cost[1][i];
			}
			sb.append(Math.max(dp[0][c-1], dp[1][c-1])+"\n");
		}
		System.out.println(sb.toString());
		br.close();
	}
	static int isTrue(int r, int c) {
		if(c>=0) return dp[r][c];
		else return 0;
	}
}
