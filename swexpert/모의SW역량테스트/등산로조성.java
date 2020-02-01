package 모의SW역량테스트;

import java.util.Scanner;

public class 등산로조성 {
	static int N, K;
	static int[][] map;
	static int MAX, result;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for(int tc=1; tc<=TC; tc++) {
			N = sc.nextInt();
			K = sc.nextInt();
			map = new int[N][N];
			visited = new boolean[N][N];
			MAX = Integer.MIN_VALUE;
			result = Integer.MIN_VALUE;
			for(int i=0; i<map.length; i++) {
				for(int j=0; j<map[i].length; j++) {
					map[i][j] = sc.nextInt();
					MAX = Math.max(MAX, map[i][j]);
				}
			}
			
			//사방탐색, 높이가 같은 곳은 안됨 / 높은 곳 -> 낮은 곳
			//딱 한곳 정해서 최대 k만큼 판다.
			for(int i=0; i<map.length; i++) {
				for(int j=0; j<map[i].length; j++) {
					if(map[i][j]==MAX) {
						//탐색
						dfs(i, j, 1, MAX, false);
					}
				}
			}
			System.out.println("#"+tc+" "+result);
		}
	}
	static boolean[][] visited;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	static void dfs(int x, int y, int len, int height, boolean k) {
		//System.out.println(x+" "+y+" "+len+" "+height+" "+k);
		
		//기저
		result = Math.max(result, len);
		visited[x][y]=true;
		
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx>=0 && ny>=0 && nx<N && ny<N && !visited[nx][ny]) {
				//if(k && map[nx][ny] < height) { //기회 없음
				if(map[nx][ny] < height) { //기회가 있으나 없으나 일단 작으면 갈 수 있음
					dfs(nx, ny, len+1, map[nx][ny], k);
				} else if(!k && map[nx][ny] - K < height) { //근데 기회가 있을때 또 갈 수 있음
					/*
					 * 무조건 높은 곳에서부터 시작하므로 나보다 같거나 작은 것들 뿐이다.
					 * 따라서 -1만 해도 괜찮음
					 * */
					//dfs(nx, ny, len+1, true); //아....높이 들고다녀야 되네 ㅋㅋ
					dfs(nx, ny, len+1, height-1, true);
				}
			}
		}
		visited[x][y]=false;
	}
}
