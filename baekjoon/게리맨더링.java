import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	static int[][] adj;
	static boolean[] visited;
	static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(bf.readLine());
		arr = new int[N];
		visited = new boolean[N+1];
		adj = new int[N + 1][N + 1];
		
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine());
			int n = Integer.parseInt(st.nextToken());
			for (int j = 0; j < n; j++) {
				int k = Integer.parseInt(st.nextToken());
				adj[i+1][k] = 1;
				adj[k][i+1] = 1;
			}

		}
		localDiv(0);
		if(min==Integer.MAX_VALUE) min=-1;
		System.out.println(min);
		
		
	}
	static ArrayList<Integer> A;
	static ArrayList<Integer> B;
	static int min = Integer.MAX_VALUE;
	static void localDiv(int idx) {
		if (idx == arr.length) {
			A = new ArrayList<>();
			B = new ArrayList<>();
			for (int i = 0; i < arr.length; i++) {
				if (visited[i]) {
					A.add(i+1);
				} else {
					B.add(i+1);
				}
			}
			if(!A.isEmpty() && !B.isEmpty()) {
				if(isLinked(A) && isLinked(B)) {
					min = Integer.min(min, Math.abs(sum(A)-sum(B)));
				}
			}
			return;
		}

		visited[idx] = false;
		localDiv(idx + 1);

		visited[idx] = true;
		localDiv(idx + 1);
	}
	
	static boolean[] visitedLink;
	static boolean isLinked(ArrayList<Integer> list) {
		visitedLink = new boolean[N+1];
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(list.get(0));
		visitedLink[list.get(0)] = true;
		while(!queue.isEmpty()) {
			int k = queue.poll();
			for(int i=1; i<list.size(); i++) {
				if(!visitedLink[list.get(i)] && adj[k][list.get(i)]==1) {
					visitedLink[list.get(i)]=true;
					queue.add(list.get(i));
				}
			}
		}
		
		boolean chk=true;
		for(int i=0; i<list.size(); i++) {
			if(visitedLink[list.get(i)]==false) {
				chk=false; break;
			}
		}
		return chk;
	}
	
	
	static int sum(ArrayList<Integer> list) {
		int sum =0;
		for(int i=0; i<list.size(); i++) {
			sum+=arr[list.get(i)-1];
		}
		return sum;
	}

}
