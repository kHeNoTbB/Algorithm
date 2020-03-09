import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {			
			String str = sc.nextLine().trim();
			String[] tmp = str.split(" ");
			
			int N = Integer.parseInt(tmp[0]);
			if(N==0) break;
			int[] arr = new int[N];
			boolean[] visited = new boolean[N];
			
			for (int i = 1; i <tmp.length; i++) {
				arr[i-1] = Integer.parseInt(tmp[i]);
			}
			dfs(0, 0, arr, visited);
			System.out.println();
		}
	}

	public static void dfs(int start, int depth, int[] arr, boolean[] visited) {
		if (depth == 6) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < arr.length; i++) {
				if (visited[i]) {
					if (i == arr.length - 1)
						sb.append(arr[i]);
					else
						sb.append(arr[i] + " ");
				}
			}
			System.out.println(sb.toString());
		}

		for (int i = start; i < arr.length; i++) {
			visited[i] = true;
			dfs(i + 1, depth + 1, arr, visited);
			visited[i] = false;
		}

	}
}
