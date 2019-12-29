package D3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 암호생성기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int T = 1; T <= 10; T++) {

			int tc = sc.nextInt();
			System.out.print("#" + tc + " ");
			Queue<Integer> queue = new LinkedList<>();
			for (int i = 0; i < 8; i++) {
				queue.add(sc.nextInt());
			}

			int minus = 0;
			while (queue.size() > 1) {

				if ((queue.peek() - (minus % 5 + 1)) > 0) {

					queue.add(queue.peek() - (minus % 5 + 1));
					queue.poll();
					minus++;
					// System.out.println("minus : " + (minus % 5+1));

				} else
					break;

			}
			queue.poll();
			queue.add(0);

			for (int i = 0; i < 8; i++) {
				System.out.print(queue.poll() + " ");
			}
			System.out.println("");
		}

	}

}

