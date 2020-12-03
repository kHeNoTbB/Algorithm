import java.util.Scanner;

public class Main {
	
	static void perm(int[] arr, int c, int[] result, boolean[] visited) {
		if (c == result.length) {
			for(int i=0; i<result.length; i++) {
				System.out.print(result[i]+" ");
			}System.out.println();
			return;
		}
		for (int i = 0; i < arr.length; i++) {

			if (!visited[i]) {
				visited[i] = true;
				result[c] = arr[i];
				perm(arr, c + 1, result, visited);
				visited[i] = false;
			}
		}

	}
	static int N;
	static int M;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=1; i<=N; i++) {
			arr[i-1]=i;
		}
		
		perm(arr, 0, new int[M], new boolean[N]);
	}
}
