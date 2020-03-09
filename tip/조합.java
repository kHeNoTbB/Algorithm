import java.util.*;

public class 조합 {
	public static void main(String[] args) {
		int N = 4;
		int[] arr = {1,2,3,4,5,6,7};
		combination_back(N, 0, 0, arr, new boolean[arr.length]);
		System.out.println();
		combination_recur(N, 0, 0, arr, new boolean[arr.length]);
	}
	
	public static void combination_recur(int N, int n, int c, int[] arr, boolean[] visited) {
		if (c == N) {
			for (int i = 0; i < arr.length; i++) {
				if (visited[i])
					System.out.print(arr[i] + " ");
			} System.out.println();
			return;
		}
		if (n == arr.length) return;

		visited[n] = true;
		combination_recur(N, n + 1, c + 1, arr, visited);
		visited[n] = false;
		combination_recur(N, n + 1, c, arr, visited);
	}
	
	public static void combination_back(int N, int depth, int r, int[] arr, boolean[] visited) {
		if(r==N) {
			for(int i=0; i<arr.length; i++) {
				if(visited[i]) System.out.print(arr[i]+" ");
			}System.out.println();
			return;
		}
		if(depth==arr.length) return;
		for(int i=depth; i<arr.length; i++) {
			visited[i] = true;
			combination_back(N, i+1, r+1, arr, visited);
			visited[i] = false;
		}
	}
}
