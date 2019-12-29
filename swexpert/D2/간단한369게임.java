package D2;

import java.util.Scanner;
public class 간단한369게임 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int max = sc.nextInt();

		for (int i = 1;  i<= max; i++) {

			int num = i;
			int r = num;
			int res = 0;
			int count = 0;

			do {
				res = num % 10;
				num = num / 10;
				if (res % 3 == 0 && res != 0)
					count++;
			} while (num / 10 != 0 || num % 10 != 0);

			if (count == 0) {
				System.out.print(r+ " ");
			} else {
				for (int j = 0; j < count; j++)
					System.out.print("-");
				System.out.print(" ");
			}

		}
	}


}
