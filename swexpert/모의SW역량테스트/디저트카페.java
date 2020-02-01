package 모의SW역량테스트;

import java.util.Scanner;

public class 디저트카페 {
	static int N, startx, starty;
	static int[][] map;
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			N =sc.nextInt();
			map = new int[N][N];
			result = Integer.MIN_VALUE;
			for(int i=0; i<map.length; i++) {
				for(int j=0; j<map[i].length; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			for(int i=0; i<N/2+1; i++) {
				for(int j=1; j<N; j++) {
					visited = new boolean[101];
					startx = i;
					starty = j;
					dfs(i, j, 0, 0);
				}
			}
			if(result==Integer.MIN_VALUE)result=-1;
			System.out.println("#"+tc+" "+result);
		}
	}
	//방향이 중요하겠군.. 무조건 오른쪽 아래 > 왼쪽 아래, 왼쪽 위, 오른쪽 위 순서여야 함!
	static int[] dr = {+1, +1, -1, -1};
	static int[] dc = {+1, -1, -1, +1};
	static int result;
	static void dfs(int r, int c, int d, int len) {
		//[기저] 3번 돌아서 원래 자리로 돌아왔을 때!
		if(r==startx && c==starty && d==3) {
			if(result<len) result=len;
		}
		
		//디저트 카페 투어를 하는 도중 해당 지역을 벗어나면 안 된다.
		if(d==4) return;
		if (!(r >= 0 && c >= 0 && r < N && c < N))
			return;
		
		//카페 투어 중에 같은 숫자의 디저트를 팔고 있는 카페가 있으면 안 된다.
		if(visited[map[r][c]]) return;
		
		
		//[백트래킹]
		visited[map[r][c]] = true;
		dfs(r+dr[d], c+dc[d], d, len+1);
		dfs(r+dr[d], c+dc[d], d+1, len+1);
		visited[map[r][c]] = false;
	}
}
