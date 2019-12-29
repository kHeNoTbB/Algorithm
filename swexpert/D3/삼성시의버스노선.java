package D3;

import java.util.Scanner;

public class 삼성시의버스노선 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[] start = new int[N];
			int[] end = new int[N];
			for(int i=0; i<N; i++) {
				start[i] = sc.nextInt();
				end[i] = sc.nextInt();
			}
			int p =sc.nextInt();		
			int cnt=0;

			System.out.printf("#"+tc);
			for(int i=0; i<p; i++) {
				cnt=0;
				int c = sc.nextInt();
				for(int j=0; j<N; j++)
					if(start[j]<=c && end[j]>=c) cnt++;
				System.out.format(" %d", cnt);
			}
			System.out.println();
		}
	}
}
