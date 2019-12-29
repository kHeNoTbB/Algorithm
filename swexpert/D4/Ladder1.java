package D4;

import java.util.Scanner;

public class Ladder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			int idx = sc.nextInt();

			int[][] arr = new int[100][100];

			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			int x = 0;
			int y = 0;
			for (int i = 0; i < 100; i++) {
				if (arr[99][i] == 2) {
					x = i;
					y = 99;
				}
			}

			while (y > 0) {
				if (x - 1 >= 0 && arr[y][x - 1] == 1)
					x--;
				else if (x + 1 < 100 && arr[y][x + 1] == 1)
					x++;
				else
					y--;
				arr[y][x] = 2;
			}
			
//			for (int i = 0; i < 100; i++) {
//				for (int j = 0; j < 100; j++) {
//					System.out.print(arr[i][j]+" ");
//				}System.out.println();
//			}
			
			System.out.println("#" + idx + " " + x);
		}

	}
}

