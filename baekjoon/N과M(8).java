import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static void combination(int[] arr, int n, int c, int[] result) {
		if(c==result.length) {
			for(int i=0; i<result.length; i++) {
				System.out.print(result[i]+" ");
			}System.out.println();
			return;
		}
		if(n==arr.length) return;
		
		result[c] = arr[n];
		combination(arr, n, c+1, result);
		combination(arr, n+1, c, result);
		
		
	}
	static int N;
	static int M;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		int[] arr= new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		combination(arr, 0, 0, new int[M]);
	}
}
