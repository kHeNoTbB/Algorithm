import java.util.*;
import java.io.*;
public class Main {
	static int stoi(String s) {
		return Integer.parseInt(s);
	}
	static int N, M;
	static boolean[] visited;
	static boolean[][] not;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = stoi(st.nextToken());
		M = stoi(st.nextToken());
		visited = new boolean[N+1];
		not = new boolean[N+1][N+1];
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = stoi(st.nextToken());
			int y = stoi(st.nextToken());
			not[x][y] = true;
			not[y][x] = true;
		}
		comb(1,0, new int[3]);
		System.out.println(ans);
	}
	static int ans;
	static void comb(int idx, int c, int[] sel) {
		if(c==3) {
			if(not[sel[0]][sel[1]] || not[sel[1]][sel[2]] || not[sel[0]][sel[2]]) return;
			ans++;
			return;
		}
		if(idx==visited.length) return;

		if(!visited[idx]) {
			visited[idx]=true;
			sel[c] = idx; 
			comb(idx+1, c+1, sel);
			visited[idx]=false;
			comb(idx+1, c, sel);
		}
		
	}
}
