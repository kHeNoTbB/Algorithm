package 모의SW역량테스트;

import java.util.PriorityQueue;
import java.util.Scanner;

public class 줄기세포배양 {
	static class Node implements Comparable<Node> {
		int r, c, X, start, activecnt;
		boolean state;
		Node(int r, int c, int X, int start, int activecnt,boolean state) {
			this.r = r;
			this.c = c;
			this.X = X;
			this.start = start;
			this.state = state;
			this.activecnt = activecnt;
		}
		
		@Override
		public int compareTo(Node o) {
			return o.X - this.X; //내림차순 정렬
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N =sc.nextInt();
			int M = sc.nextInt();
			int K =sc.nextInt();
			int[][] map = new int[350][350];
			boolean[][] visited = new boolean[350][350];
			PriorityQueue<Node> pq = new PriorityQueue<>();
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					map[i+150][j+150] = sc.nextInt();
					if(map[i+150][j+150]!=0) pq.add(new Node(i+150, j+150, map[i+150][j+150], 0, 0, true)); 
				}
			}
			int[] dr = {0,0,1,-1};
			int[] dc = {1,-1,0,0};
			for(int k=1; k<=K; k++) {
				PriorityQueue<Node> tmp = new PriorityQueue<>();
				int size = pq.size();
				for(int s=0; s<size; s++) {
					Node poll = pq.poll();
					visited[poll.r][poll.c] = true;
					if(!poll.state) { 
						for(int i=0; i<4; i++) {
							int nr = poll.r + dr[i];
							int nc = poll.c + dc[i];
							if(!visited[nr][nc]) {
								tmp.add(new Node(nr, nc, poll.X, k, 0, true));
								visited[nr][nc] = true;
							}
						}
						if(poll.activecnt==poll.X) continue;
						tmp.add(new Node(poll.r, poll.c, poll.X, poll.start, poll.activecnt+1, false));
					}
					else {
						if(poll.start+poll.X==k) tmp.add(new Node(poll.r, poll.c, poll.X, poll.start, poll.activecnt+1, false));
						else tmp.add(new Node(poll.r, poll.c, poll.X, poll.start, poll.activecnt, true));
					}
				}
				while(!tmp.isEmpty()) {
					Node poll = tmp.poll();
					visited[poll.r][poll.c] = true;
					pq.add(poll);
				}
			}
			System.out.println("#"+tc+" "+pq.size());
		}
	}
}
