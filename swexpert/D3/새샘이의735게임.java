package D3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class AscendingInteger implements Comparator<Integer> {

	@Override
	public int compare(Integer a, Integer b) {
		return b.compareTo(a);
	}

}

public class 새샘이의735게임 {
	static int max = 0;
	static int[] cnt = new int[max * 3];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int[] arr = new int[7];
			List<Integer> sum = new LinkedList<>();
			int answer = 0;

			for (int i = 0; i < 7; i++)
				arr[i] = sc.nextInt();

			for (int i = 0; i < 7; i++) {
				for (int j = 1 + i; j < 7; j++) {
					for (int k = 1 + j; k < 7; k++) {
						sum.add(arr[i] + arr[j] + arr[k]);
					}
				}
			}

			int cnt = 0;
			Collections.sort(sum, new AscendingInteger());
			// System.out.println(sum);
			int min = sum.get(0);
			for (int i = 0; i < sum.size(); i++) {
				// System.out.println(min);
				if (min == sum.get(i))
					continue;
				else if (min > sum.get(i)) {
					min = sum.get(i);
					cnt++;
				}

				if (cnt == 4) {
					answer = sum.get(i);
					break;
				}
			}

			System.out.println("#" + tc + " " + answer);
		}
	}

}