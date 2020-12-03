import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static void mul_permutation(String result, int n) {
		if(n==M) {
			System.out.println(result);
			return;
		}
		
		for(int i=0; i<N; i++)
		mul_permutation(result+arr[i]+" ", n+1);
		
		
		
	}
	static int N;
	static int M;
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr= new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		mul_permutation("", 0);
	}
}
