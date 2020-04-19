import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =Integer.parseInt(sc.nextLine()); //시험장의 개수
		int[] A = new int[N];
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(sc.nextLine());
		int B = Integer.parseInt(st.nextToken()); //총 감독관이 감시할 수 있는 수
		int C = Integer.parseInt(st.nextToken());//부 감독관이 감시할 수 있는 수
		
		long result = 0;
		for(int a=0; a<A.length; a++) {
			int student = A[a];
			student -= B;
			result++;
			if(student>0) {
				result += student/C;
				if(student%C!=0) result++;
			}
		}
		System.out.print(result);
	}
}
