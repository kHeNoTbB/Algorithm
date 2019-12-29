package D3;

import java.util.Scanner;

public class 계산기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long result = 0;
		for (int tc = 1; tc <= T; tc++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			long[] hit = new long[2];

			for (int i = 0; i < arr.length; i++)
				arr[i] = sc.nextInt();
			
			if(n==1) {System.out.println("#" + tc + " " + arr[0]); continue;}
			hit[0] = arr[0];
			for (int i = 0; i < arr.length - 1; i++) {
				hit[1] = arr[i + 1];
				if (hit[0] + hit[1] < hit[0] * hit[1])
					result = hit[0] * hit[1];
				else
					result = hit[0] + hit[1];
				hit[0] = result;
			}
			System.out.println("#" + tc + " " + result);
			result = 0;
		}
	}
}

