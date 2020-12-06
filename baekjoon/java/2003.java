import java.util.*;
import java.io.*;
public class 수들의합2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int n=0; n<N; n++) {
			arr[n] = Integer.parseInt(st.nextToken());
		}
		
		int ans = 0, sum = 0;
		for(int i=0; i<N; i++) {
			sum += arr[i];
			if(sum>=M) {
				if(sum==M) ans++;
				sum = 0;
				continue;
			} else {
				for(int j=i+1; j<N; j++) {
					sum += arr[j];
					if(sum>=M) {
						if(sum==M) ans++;
						sum = 0;
						break;
					}
				}
				sum = 0;
			}
		}
		System.out.print(ans);
	}
}
