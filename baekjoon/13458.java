import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =Integer.parseInt(sc.nextLine());
		int[] A = new int[N];
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		int B = sc.nextInt();
		int C = sc.nextInt();
		long result = N;
		for(int a=0; a<A.length; a++) {
			A[a] -= B;
			if(A[a]>0) result += A[a]%C==0?A[a]/C:A[a]/C+1;
		}
		System.out.print(result);
	}
}
