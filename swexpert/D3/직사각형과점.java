package D3;

import java.util.Scanner;

public class 직사각형과점 {

	static class Point {
		int x;
		int y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static int[] answer;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			answer = new int[3];
			Point start = new Point(sc.nextInt(), sc.nextInt());
			Point end = new Point(sc.nextInt(), sc.nextInt());

			int N = sc.nextInt();
			for (int i = 0; i < N; i++) {
				Point point = new Point(sc.nextInt(), sc.nextInt());

				if (point.x > start.x && point.x < end.x && point.y > start.y && point.y < end.y)
					answer[0]++;

				else if (point.x < start.x || point.x > end.x
						|| (start.x <= point.x && point.x <= end.x) && (point.y < start.y || end.y < point.y))
					answer[2]++;

			}

			answer[1] = N - (answer[0] + answer[2]);
			System.out.println("#" + tc + " " + answer[0] + " " + answer[1] + " " + answer[2]);
		}
	}
}
