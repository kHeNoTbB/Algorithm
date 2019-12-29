package D3;

import java.util.Scanner;

public class View {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();
			int[] building = new int[N];
			for (int i = 0; i < building.length; i++)
				building[i] = sc.nextInt();

			int good = 0;

			for (int i = 2; i < building.length - 2; i++) {
				int max = Math.max(Math.max(building[i + 1], building[i + 2]),
						Math.max(building[i - 1], building[i - 2]));
				if (max < building[i])
					good += building[i] - max;
			}
			System.out.println("#" + tc + " " + good);
		}
		sc.close();
	}
}

