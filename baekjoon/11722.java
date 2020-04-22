import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] cost = new int[N];
		int[] dp = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			cost[i] = Integer.parseInt(st.nextToken());
		}
		
		int MAX = 0;
		for(int i=1; i<N; i++) {
			for(int j=0; j<i; j++) {
				if(cost[i]<cost[j] && dp[i]>=dp[j]) {
					dp[i] = Math.max(dp[j]+1, dp[i]);
				} else if(cost[i]==cost[j])
					dp[i] = dp[j];
			}
			MAX = Math.max(MAX, dp[i]);
		}
		System.out.println(MAX+1);
	}
}
