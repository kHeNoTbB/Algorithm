package D3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class zero_one_knapsack {
	public static class bag {
		int value;
		int weight;

		bag(int wei, int val) {
			this.weight = wei;
			this.value = val;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int num = sc.nextInt(); // 4
			int weight = sc.nextInt(); // 5

			ArrayList<bag> list = new ArrayList<>();
			for (int i = 0; i < num; i++) {
				list.add(new bag(sc.nextInt(), sc.nextInt()));
			}

			// 초기화
			int[] dp = new int[weight + 1];
			for (int i = 1; i <= weight; i++) {
				if (list.get(0).weight <= i)
					dp[i] = list.get(0).value;
			}
			// System.out.println(Arrays.toString(dp));
			int[] tmp = new int[weight + 1];
			for (int j = 1; j < weight + 1; j++) {
				tmp[j] = dp[j];
			}
			int max = 0;
			for (int i = 1; i < num; i++) {
				// System.out.println("tmp "+Arrays.toString(tmp));
				for (int j = 1; j <= weight; j++) {

					if (list.get(i).weight < j) {
						if (list.get(i).value + tmp[j - list.get(i).weight] > tmp[j]) {
							dp[j] = list.get(i).value + tmp[j - list.get(i).weight];
						} else
							//dp[j] = list.get(i).value;
							dp[j] = tmp[j];
					}
					if (dp[j] > max)
						max = dp[j];

				}
				// System.out.println(Arrays.toString(dp));
				for (int j = 0; j < weight + 1; j++) {
					tmp[j] = dp[j];
				}
			}

			System.out.println("#" + tc + " " + max);

		}
	}
}

