import java.util.*;
public class Main {
	static class Data {
		int data, len;
		Data(int data, int len) {
			this.data = data;
			this.len = len;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] chon = new int[N + 1][N + 1];
		int p1 = sc.nextInt();
		int p2 = sc.nextInt();
		int M = sc.nextInt();
		for (int m = 0; m < M; m++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			chon[a][b] = chon[b][a] = 1;
		}
		boolean[] visited = new boolean[N + 1];
		Queue<Data> queue = new LinkedList<>();
		queue.add(new Data(p1, 0));
		int answer = -1;
		while (!queue.isEmpty()) {
			Data poll = queue.poll();
            visited[poll.data]=true;
			if (poll.data == p2) {
				answer = poll.len;
				break;
			}
			for (int i = 1; i <= N; i++)
				if (!visited[i] && chon[poll.data][i] == 1)
					queue.add(new Data(i, poll.len + 1));
		}
		System.out.println(answer);
	}
}
