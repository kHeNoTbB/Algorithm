package D3;

import java.util.Scanner;

public class digitsum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			String num = sc.next();

			while (num.length() != 1) {
				int sum = 0;
				for (int i = 0; i < num.length(); i++) {
					sum += num.charAt(i) - '0';
				}
				num = sum+"";
			}

			System.out.println("#" + tc + " " + num);
		}
	}
}
