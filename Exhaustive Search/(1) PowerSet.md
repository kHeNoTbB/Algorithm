# PowerSet
* 공집합과 자기 자신을 포함한 모든 부분집합
* 각 원소가 포함되거나 포함되지 않는 2가지 경우의 수를 계산하면 모든 부분집합의 수가 계산된다.

## 비트 연산을 활용한 PowerSet
    public class PowerSet_Bitmap {
	    public static void main(String[] args) {
		    int[] arr = {1,3,5};
		
		    for(int i=0; i<(1<<arr.length); i++) { //i는 0부터 7까지 (8개, 2^3개)
			    for(int j=0; j<arr.length; j++) {
				    if((i & (1<<j))!=0) System.out.print(arr[j]+" ");
			    }
			    System.out.println();
		    }
	    }
    }

* 원소로 1, 3, 5 를 가진 부분집합을 구해봤다.

## 백트래킹을 활용한 PowerSet - DFS
    package SWEA;

    import java.util.Scanner;

    public class _2817_부분수열의합 {
	    static int[] arr;
	    static int N, K, result;

	    public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();
		    for (int tc = 1; tc <= T; tc++) {
			    N = sc.nextInt();
			    K = sc.nextInt();
			    arr = new int[N];
			    for (int i = 0; i < arr.length; i++) {
				    arr[i] = sc.nextInt();
			    }

			    result = 0;
			    visited = new boolean[N];
			    _powerSet(0);

		    }
	    }

	    static boolean[] visited;
	    static void _powerSet(int idx) {
		    if (idx == arr.length) {
			    for (int i = 0; i < visited.length; i++) {
				    if (!visited[i]) {
					    System.out.print(arr[i] + " ");
				    }
			    }
			    System.out.println();
			    return;
		    }

		    visited[idx] = true;
		    _powerSet(idx + 1);
		    visited[idx] = false;
		    _powerSet(idx + 1);

	    }
    }
