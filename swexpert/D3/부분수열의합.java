package D3;

import java.util.Scanner;

public class 부분수열의합 {
	static int[] arr;
	static boolean[] sel;
	static int K;
	static int N;
	static int cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			cnt=0;
			N = sc.nextInt();
			K = sc.nextInt();
			arr = new int[N];
			sel = new boolean[N];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}

			powerSet(0);
			System.out.println("#"+tc+" "+cnt);
			

		}
	}

	static void powerSet(int idx) {
		if (idx == N) {
			int sum = 0;
			for (int i = 0; i < N; i++) {
				if (sel[i]) {
					sum += arr[i];
					//System.out.print(arr[i]+" ");
				}
			}//System.out.println();
			if (sum == K)
				cnt++;
			return;
		}

		sel[idx] = false;
		powerSet(idx + 1);
		sel[idx] = true;
		powerSet(idx + 1);

	}
}

