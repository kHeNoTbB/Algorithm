package D3;

import java.util.Scanner;

public class 테네스의특별한소수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int D = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
			int answer = 0;

			boolean[] isNotPrime = new boolean[B + 1];

			for (int i = 2; i <= Math.sqrt(B); i++) { // or i*i<=100
				for (int j = 2; i * j <= B; j++) {
					isNotPrime[i * j] = true;
				}
			}

			for (int i = A; i < isNotPrime.length; i++) {
				if(i==1) continue;
				if (!isNotPrime[i]) {
					String str = "";
					str += i;
					if (str.contains(D + ""))
						answer++;
				}
			}
			System.out.println("#" + tc + " " + answer);
		}

	}
}

