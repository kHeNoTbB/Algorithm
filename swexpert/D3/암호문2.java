package D3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class 암호문2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int T = 1; T <= 10; T++) {

			// 원본 암호문의 길이
			int encode_len = sc.nextInt();

			// default encode input
			List<Integer> list = new LinkedList<>();
			for (int i = 0; i < encode_len; i++)
				list.add(sc.nextInt());

			// command
			int com = sc.nextInt();

			for (int i = 0; i < com; i++) {
				char command = sc.next().charAt(0); // I

				switch (command) {
				case 'I': {
					int index = sc.nextInt(); // 1
					int len = sc.nextInt(); // 5
					
					for (int j = 0; j < len; j++)
						list.add(j + index, sc.nextInt());
					break;
				}

				case 'D': {
					int index = sc.nextInt(); // 4
					int len = sc.nextInt(); // 4

					for (int j = 0; j < len; j++)
						list.remove(index);
					break;
				}

				}

			}
			System.out.print("#" + T + " ");
			for (int i = 0; i < 10; i++)
				System.out.print(list.get(i) + " ");
			System.out.println();
		}

	}
}

