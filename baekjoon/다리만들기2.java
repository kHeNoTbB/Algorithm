import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int[][] map;
	static boolean[][] visited;
	static int num;

	static class Point {
		int r;
		int c;

		Point(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}

	static class Edge {
		int start;
		int end;
		int weight;

		Edge(int start, int end, int weight) {
			this.start = start;
			this.end = end;
			this.weight = weight;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		map = new int[N][M];
		visited = new boolean[N][M];
		num = 1;

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		// (1) 각 1들이 모여있는 동어리를 2로, 3으로, 3로 순서대로.. 모두 영역에 숫자를 매겨준다.
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == 1) {
					bfs(i, j);
				}
			}
		}

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] > 0) {
					map[i][j] -= 1;
				}
			}
		}

		//printmap(map);

		// (2) 각 영역에서 상하좌우가 0이라면, 0이 아닐 때까지 계속 나가면서 몇칸인지 세기.
		// 다른 육지를 만나면 인접행렬 혹은 인접리스트에 경로비용을 작성함으로써 인접행렬/리스트 정보 생성
		// 이미 경로를 계산했다면, 또 이 전에 구한 작은 값이 있다면 그것으로 해야 함.

		// ↑ 방향
		int[][] adj = new int[num][num];
		for (int i = 0; i < map.length; i++) {
			int count = 0;
			int land = 0;
			boolean check = false;
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] > 0 && map[i][j] < num) {

					if ((adj[land][map[i][j]] == 0 || adj[land][map[i][j]] > count) && count > 1) {
						adj[land][map[i][j]] = count;
						adj[map[i][j]][land] = count;
					}

					land = map[i][j];
					count = 0;
				}

				// 찾은 상태에서 0이면 카운팅
				if (map[i][j] == 0) {
					count++;
					continue;
				}
			}
		}

		// ↓ 방향
		for (

				int j = 0; j < M; j++) {
			int count = 0;
			int land = 0;
			boolean check = false;
			for (int i = 0; i < map.length; i++) {
				if (map[i][j] > 0 && map[i][j] < num) {

					if ((adj[land][map[i][j]] == 0 || adj[land][map[i][j]] > count) && count > 1) {
						adj[land][map[i][j]] = count;
						adj[map[i][j]][land] = count;
					}

					land = map[i][j];
					count = 0;
				}

				// 찾은 상태에서 0이면 카운팅
				if (map[i][j] == 0) {
					count++;
					continue;
				}

			}
		}

		//printmap(adj);

		// (3) MST
		parents = new int[adj.length + 1];
		for (int i = 0; i < parents.length; i++) {
			parents[i] = i;
		}

		ArrayList<Edge> edges = new ArrayList<>();
		for (int i = 1; i < adj.length; i++) {
			for (int j = 1; j < adj[i].length; j++) {
				if (adj[i][j] > 0) {
					edges.add(new Edge(i, j, adj[i][j]));
				}
			}
		}

		Collections.sort(edges, new Comparator<Edge>() {

			@Override
			public int compare(Edge arg0, Edge arg1) {
				return arg0.weight - arg1.weight;
			}

		});

		/*for (int i = 0; i < edges.size(); i++) {
			System.out.println(edges.get(i).start + " " + edges.get(i).end + " " + edges.get(i).weight);
		}*/

		int cnt = 0;
		long sum = 0;
		for (int i = 0; i < edges.size(); i++) {
			if (cnt == adj.length - 2)
				break;
			if (findSet(edges.get(i).start) != findSet(edges.get(i).end)) {
				//System.out.println("선택 " + edges.get(i).start + " " + edges.get(i).end + " " + edges.get(i).weight);
				union(edges.get(i).start, edges.get(i).end);
				sum += edges.get(i).weight;
				cnt++;
			}
		}
		
		if(cnt != adj.length - 2) sum=-1;
		System.out.println(sum);

	}

	static int[] parents;

	static void makeSet(int x) {
		parents[x] = x;
	}

	static int findSet(int x) {
		if (x == parents[x])
			return x;
		else {
			parents[x] = findSet(parents[x]);
			return parents[x];
		}
	}

	static void union(int x, int y) {
		int px = findSet(x);
		int py = findSet(y);
		if (px != py) {
			parents[py] = px;
		}
	}

	static int[] dr = { 0, 0, 1, -1 };
	static int[] dc = { 1, -1, 0, 0 };

	static void bfs(int r, int c) {
		Queue<Point> queue = new LinkedList<>();
		queue.add(new Point(r, c));
		visited[r][c] = true;
		map[r][c] = ++num;

		while (!queue.isEmpty()) {
			Point p = queue.poll();

			for (int i = 0; i < 4; i++) {
				int nr = p.r + dr[i];
				int nc = p.c + dc[i];

				if (nr >= 0 && nc >= 0 && nr < map.length && nc < map[nr].length && !visited[nr][nc]) {
					if (map[nr][nc] == 1) {
						visited[nr][nc] = true;
						map[nr][nc] = num;
						queue.add(new Point(nr, nc));
					}
				}
			}

		}

	}

	static void printmap(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
