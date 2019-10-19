import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static void permutation(int[] arr, int[] result, boolean[] visited, int n) {
		if(n==result.length) {
			for(int i=0; i<result.length; i++) {
				System.out.print(result[i]+" ");
			}System.out.println();
			return;
		}
		for(int i=0; i<arr.length; i++) {
			if(!visited[i]) {
				visited[i] = true;
				result[n] = arr[i];
				permutation(arr, result, visited, n+1);
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
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		//순열
		permutation(arr, new int[M], new boolean[N], 0);
	}
}
