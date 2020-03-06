import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		
		int M =sc.nextInt();
		for(int i=0; i<M; i++) {
			System.out.println(find(sc.nextInt(), A) ? 1 : 0);
		}
	}
	
	public static boolean find(int n, int[] A) {
		int start = 0;
		int end = A.length-1;
		int mid = 0;
				
		while(start<=end) {
			mid = (start+end)/2;
			
			if(A[mid]==n) {
				return true;
			}
			
			else {
				/*
				 * 이 부분에서 자칫하면 무한루프에 빠질 수 있다.
				 * 만약 start와 end 사이에 아무 숫자도 없고 start와 mid가 같은 곳을 가리킬 수 있기 때문이다.
				 * 따라서 start는 mid보다 하나 크게(어차피 찾는 숫자가 mid보다 더 크니까), 
				 * end는 mid보다 하나 작게(어차피 찾는 숫자가 mid보다 더 작으니까)한다.
				 */
				if(n>A[mid]) {
					start = mid+1;
				} else {
					end = mid-1;
				}
			}
			//System.out.println(start+" "+end);
			if(start>end) return false;
		}
		
		return false;
	}
}
