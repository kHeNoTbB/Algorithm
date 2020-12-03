import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	// 가장 처음에 양분은 모든 칸에 5만큼 들어있다.
	// 1x1 크기 칸에 여러개의 나무를 심을 수 있다.

	// 봄: 나무가 자신의 나이만큼 양분을 먹고, 나이가 1증가함. 나이가 어린 나무부터 양분을 먹음. 자신의 나이만큼 양분을 못 먹으면 죽음
	// 여름: 죽은 나무가 양분으로 변함. 죽은 나무마다 나이를 2로 나누면 양분으로 추가됨. 소수점 아래는 버림.
	// 가을: 나이가 5의 배수인 나무는 8방으로 나이가 1인 나무를 번식한다.
	// 겨울: S2D2가 양분을 추가한다.

	// N: 땅 크기 NxN
	// M: 나무정보 개수
	// K: K년이 지난 후 살아남은 나무의 수는?

	// 그 다음 입력은 양분정보
	// X Y Z (X,Y)에 Z나이인 나무

	static class Pointer implements Comparable<Pointer> {
		int x;
		int y;
		int age;

		Pointer(int x, int y, int age) {
			this.x = x;
			this.y = y;
			this.age = age;
		}

		@Override
		public String toString() {
			return "[x=" + x + ", y=" + y + ", age=" + age + "]";
		}

		@Override
		public int compareTo(Pointer p) { // age 오름차순
			if (this.age > p.age) {
				return 1;
			} else if (this.age < p.age) {
				return -1;
			}
			return 0;
		}

	}

	static int[] dx = { -1, -1, 0, 1, 1, 1, 0, -1 };
	static int[] dy = { 0, 1, 1, 1, 0, -1, -1, -1 };
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int[][] nutri = new int[N + 1][N + 1];
		int[][] robot = new int[N + 1][N + 1];
		Queue<Pointer> alive = new LinkedList<>();
		Queue<Pointer> dead = new LinkedList<>();
		PriorityQueue<Pointer> pq = new PriorityQueue<Pointer>();

		int M = Integer.parseInt(st.nextToken());
		int YEAR = Integer.parseInt(st.nextToken());

		for (int i = 1; i < nutri.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j < nutri[i].length; j++) {
				robot[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		// 가장 처음에 양분은 모든 칸에 5만큼 들어있다.
		for (int i = 1; i < nutri.length; i++) {
			for (int j = 1; j < nutri[i].length; j++) {
				nutri[i][j] = 5;
			}
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int age = Integer.parseInt(st.nextToken());

			// 큐에 넣기
			alive.add(new Pointer(x, y, age));
		}

		// 우선 pq에 넣고나서, 각 계절이 끝나면 살아있는 것과 죽은 것들을 pq에 넣..?
		for (int y = 0; y < YEAR; y++) {
			// (1) 봄: 나무가 자신의 나이만큼 양분을 먹고, 나이가 1증가함. 나이가 어린 나무부터 양분을 먹음. 자신의 나이만큼 양분을 못 먹으면
			// 죽음
			pq.addAll(alive);
			alive.clear();
			while (!pq.isEmpty()) {
				Pointer tmp = pq.poll();
				// 자신의 나이만큼 양분이 남아있지 않다면
				if (nutri[tmp.x][tmp.y] < tmp.age) {
					// 죽음
					dead.add(tmp);
				} else { // 양분이 남아있다면, 나무자 자신의 나이만큼 양분을 먹고, 나이가 1증가한다.
					nutri[tmp.x][tmp.y] -= tmp.age;
					alive.add(new Pointer(tmp.x, tmp.y, tmp.age + 1));
				}
			}
			
			// (2) 여름: 죽은 나무가 양분으로 변함. 죽은 나무마다 나이를 2로 나누면 양분으로 추가됨. 소수점 아래는 버림.
			while (!dead.isEmpty()) {
				Pointer tmp = dead.poll();
				nutri[tmp.x][tmp.y] += tmp.age / 2;
			}
			
			// (3) 가을 : 나이가 5의 배수인 나무는 8방으로 나이가 1인 나무를 번식한다.
			pq.addAll(alive);
			while(!pq.isEmpty()) {
				Pointer tmp = pq.poll();
				if(tmp.age % 5 == 0) { //5의 배수인 나이를 갖고 있는 나무는
					
					for(int i=0; i<8; i++) {
						int nx = tmp.x + dx[i];
						int ny = tmp.y + dy[i];
						
						//map 안에서 8방에 나이 1인 나무 번식
						if(nx>=1 && ny>=1 && nx<nutri.length && ny<nutri[nx].length) {
							alive.add(new Pointer(nx, ny, 1));
						}
					}
					
				}
			
			}
						
			//(4) 겨울 : S2D2가 양분을 추가한다.
			for(int i=0; i<nutri.length; i++) {
				for(int j=0; j<nutri[i].length; j++) {
					nutri[i][j] += robot[i][j];
				}
			}
			
		} // for문 끝
		
		System.out.println(alive.size());
	}
	static void print(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}System.out.println();
	}
}
