import java.util.*;
import java.io.*;
public class Main {
	static List<Integer>[] adj;
	static int N;
	static int[] parents;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		N = Integer.parseInt(br.readLine());
		adj = new ArrayList[N+1];
		parents = new int[N+1];
		for(int i=0; i<=N; i++) adj[i] = new ArrayList<>();
		for(int n=0; n<N-1; n++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			adj[x].add(y);
			adj[y].add(x);
		}
		parents[1]=1;
		find(1);
		StringBuilder sb = new StringBuilder();
		for(int i=2;i<parents.length; i++) sb.append(parents[i]+"\n");
		System.out.println(sb);
	}
	static void find(int n) {
		for(int i=0; i<adj[n].size(); i++) {
			if(parents[adj[n].get(i)]==0) {
				parents[adj[n].get(i)] = n;
				find(adj[n].get(i));
			}	
		}
	}
}
