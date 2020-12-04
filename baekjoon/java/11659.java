import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] a = new int[n + 1];
		st=new StringTokenizer(br.readLine());
		
		for(int i=1;i<=n;i++) {
			a[i]=a[i-1]+Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int res = a[e]-a[s-1];
			sb.append(res + "\n");
		}
		System.out.print(sb);
	}
}
