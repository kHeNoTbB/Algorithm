import java.util.*;
import java.io.*;
public class Main {
	static char[][] map;
	static boolean[][] visited;
	static int N, M;
	static StringTokenizer st;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			if(N==0 && M==0) break;
			map = new char[N][M];
			visited = new boolean[N][M];
			for(int i=0; i<N; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<M; j++) {
					map[i][j] = st.nextToken().charAt(0);
				}
			}
			
			int ans = 0;
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					if(map[i][j]=='1' && !visited[i][j]) {
						visited[i][j]=true;
						dfs(i, j);
						ans++;
					}
				}
			}
			sb.append(ans+"\n");
		}
		System.out.print(sb);
	}
	static int[] dr = {0,0,1,-1,-1,-1,1,1};
	static int[] dc = {1,-1,0,0,-1,1,-1,1};
	static void dfs(int r, int c) {
		for(int i=0; i<8; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			if(nr>=0 && nr<N && nc>=0 && nc<M && !visited[nr][nc] && map[nr][nc]=='1') {
				visited[nr][nc]=true;
				dfs(nr, nc);
			}
		}
	}
}
