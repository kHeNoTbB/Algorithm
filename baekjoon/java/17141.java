import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int[][] map;
	static class Node {
		int r;
		int c;
		Node(int r, int c) {
			this.r = r;
			this.c = c;
		}
		@Override
		public String toString() {
			return "Node [r=" + r + ", c=" + c + "]";
		}
	}

	static Node[] sel;
	static int N;
	static ArrayList<Node> virus;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int MaxVirus = sc.nextInt();
		map = new int[N][N];
		sel = new Node[MaxVirus];

		virus = new ArrayList<>();
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = sc.nextInt();
				if (map[i][j] == 2) {
					virus.add(new Node(i, j));
				}
			}
		}
		// print(map);
		selectVirus(0, 0);
		if(!ch) {
			System.out.println(-1);
		}
		else
			System.out.println(MIN-1);

	}
	
	static boolean ch;
	static int[][] mapcopy;
	static int MIN = Integer.MAX_VALUE;
	static void selectVirus(int n, int c) {
		if (c == sel.length) {
			//System.out.println(Arrays.toString(sel));
			mapcopy = new int[N][N];

			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if (map[i][j] == 1) // 일단 벽만 세우기
						mapcopy[i][j] = -1;
				}
			}

			for (int i = 0; i < sel.length; i++) {
				mapcopy[sel[i].r][sel[i].c] = 1; // 바이러스로 선택한 곳은 1로
			}

			
			infection();
			//print(mapcopy);
			int max=0;
			int min=Integer.MAX_VALUE;
			for(int i=0; i<mapcopy.length; i++) {
				for(int j=0; j<mapcopy[i].length; j++) {
					if(max<mapcopy[i][j]) {
						max = mapcopy[i][j];
					}
					if(mapcopy[i][j]!=-1) {
						if(min>mapcopy[i][j]) {
							min = mapcopy[i][j];
						}
					}
				}
			}
			
			if(!ch && min!=0) { //원래 FALSE고, min =0이 아닌게 하나라도 있으면
				ch=true; //true라는 건, min이 0이 아닌게 있다는 소리
			}
			if(min!=0)
				MIN = Integer.min(max, MIN);
			
			
			
			return;
		}
		if (n == virus.size()) {
			return;
		}
		sel[c] = virus.get(n);
		selectVirus(n + 1, c + 1);
		selectVirus(n + 1, c);
	}

	static int[] dr = { 0, 0, 1, -1 };
	static int[] dc = { 1, -1, 0, 0 };
	static int sec;
	static boolean[][] visited;

	static void infection() {
		Queue<Node> queue = new LinkedList<>();
		visited = new boolean[N][N];
		sec = 2;
		for (int i = 0; i < mapcopy.length; i++) {
			for (int j = 0; j < mapcopy[i].length; j++) {
				if (mapcopy[i][j] == 1) {
					queue.add(new Node(i, j));
					visited[i][j] = true;
				}
			}
		}
		
		
		while (!queue.isEmpty()) {
			ArrayList<Node> tmpNode = new ArrayList<>();
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				Node n = queue.poll();

				for (int d = 0; d < 4; d++) {
					int nr = n.r + dr[d];
					int nc = n.c + dc[d];

					if (nr >= 0 && nc >= 0 && nr < mapcopy.length && nc < mapcopy[nr].length && !visited[nr][nc]) {
						if (mapcopy[nr][nc] == 0) { //빈 공간이라면?
							mapcopy[nr][nc] = sec;
							tmpNode.add(new Node(nr,nc));
						}
					}

				}
			}
			sec++;
			for(int i=0; i<tmpNode.size(); i++) {
				queue.add(new Node(tmpNode.get(i).r,tmpNode.get(i).c));
				visited[tmpNode.get(i).r][tmpNode.get(i).c]=true;
			}
		}

	}

	static void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
