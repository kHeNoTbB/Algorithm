import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] dp = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int ans = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<i; j++) {
				if(arr[j]>arr[i] && dp[i]<=dp[j]) dp[i] = dp[j]+1;
			}
			ans = Math.max(ans, dp[i]);
		}
		System.out.print(N-(ans+1));
	}
}
