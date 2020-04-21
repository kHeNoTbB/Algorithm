import java.util.*;
import java.io.*;
public class Main {
	static class Node {
		int r, c;

		Node(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}

	static int N, L, R;
	static int[][] map;
	static boolean[][] visited;
	static int[] dr = { 0, 0, 1, -1 };
	static int[] dc = { 1, -1, 0, 0 };
	static boolean flag;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		map = new int[N][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int answer = 0;
		while (true) {
			flag = false;
			visited = new boolean[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (!visited[i][j]) {
						bfs(i, j);
					}
				}
			}

			if (!flag)
				break;
			answer++;
		}
		System.out.println(answer);
	}

	static void bfs(int r, int c) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(new Node(r, c));
		ArrayList<Node> list = new ArrayList<>();
		list.add(new Node(r, c));
		int sum = 0;
		int num = 0;

		while (!queue.isEmpty()) {
			Node poll = queue.poll();
			visited[poll.r][poll.c] = true;
			num++;
			sum += map[poll.r][poll.c];
			
			for (int i = 0; i < 4; i++) {
				int nr = poll.r + dr[i];
				int nc = poll.c + dc[i];

				if (nr >= 0 && nc >= 0 && nr < N && nc < N && !visited[nr][nc]) {
					int mid = Math.abs(map[nr][nc]-map[poll.r][poll.c]);
					if (mid>= L && mid <= R) {
						queue.add(new Node(nr, nc));
						visited[nr][nc] = true;
						flag = true;
						list.add(new Node(nr, nc));
					}
				}
			}
		}
		if (flag) {
			int new_ = sum / num;
			for(Node n : list) {
				if(visited[n.r][n.c]) {
					map[n.r][n.c]=new_;
				}
			}
		}
	}
}
