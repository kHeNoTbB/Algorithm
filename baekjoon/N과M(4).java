import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static void mul_permutation(String result, int n) {
		if (n == M) {
			System.out.println(result);
			return;
		}
		
		for (int i = 1; i <=N; i++) {
			mul_permutation(result+i+" ", n + 1);
		}
	}
	
	static void combination(int[] arr, int n, int c, int[] result) {
		if(c==result.length) {
			for(int i=0; i<result.length; i++) {
				System.out.print(result[i]+ " ");
			}System.out.println();
			return;
		}
		if(n==arr.length) return;
		
			result[c] = arr[n];
			combination(arr, n, c+1, result);
			combination(arr, n+1, c, result);
		
		
		
		
	}
	
	static int M;
	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=1; i<=N; i++) {
			arr[i-1]=i;
		}
		
		// 중복순열
		//mul_permutation("", 0);
		
		//조합
		//arr, n, c, result
		combination(arr, 0, 0, new int[M]);

	}
}
