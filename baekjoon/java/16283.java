import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()); //양이 먹는 양
		int b = Integer.parseInt(st.nextToken()); //염소가 먹는양
		int n = Integer.parseInt(st.nextToken()); //전체 동물
		int w = Integer.parseInt(st.nextToken()); //어제먹은양
		
		int x = 1;
		int cnt = 0, ans = 0;
		for(;x<n;x++) {
			if(x*a + (n-x)*b == w) {
				cnt ++;
				ans = x;
			}
		}
		if(cnt!=1) System.out.print(-1);
		else System.out.print(ans+" "+(n-ans));
	}
}
