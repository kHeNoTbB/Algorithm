# [Permutation 순열](https://bcp0109.tistory.com/14)
* 서로 다른 것들 중 몇 개를 뽑아서 한 줄로 나열하는 것
* 1부터 N까지 M개를 순서대로 고른다. 즉, 순서가 있지만 중복이 없다.
* 방법으로 **swap**과 **visited**가 있다.


## 단순하게 순열을 생성하는 방법
    public class loop {
    	public static void main(String[] args) {
	    	for(int i=1; i<=3; i++) {
		    	for(int i2=1; i2<=3; i2++) {
			    	if(i!=i2) {
				    	for(int i3 =1; i3<=3; i3++ ) {
					    	if(i3!=i && i3!=i2)
						    	System.out.println(i + " "+ i2 +" "+ i3);
					    }
			    	}
		    	}
	    	}
    	}
    }
* 위 코드는 { 1 2 3 } { 1 3 2 } { 2 1 3 } { 2 3 1 } { 3 1 2 } { 3 2 1 } 의 출력값을 갖는다.

## swap을 이용한 순열

    import java.util.Arrays;
    public class recur {
	    public static void main(String[] args) {
		    perm(new int[] {1,2,3}, 0);
	    }
	    static void perm(int[] arr, int k) {
		    if(k==arr.length) {
			    System.out.println(Arrays.toString(arr));
			    return;
		    }
		    for(int i=k; i<arr.length; i++) {
			    swap(arr, i, k);
			    perm(arr, k+1);
			    swap(arr, i, k);
		    }
	    }
	
	    static void swap(int[] arr, int a, int b) {
    //		    arr[a] <=swap=> arr[b]
		    int tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;
	    }
    }
    
* 위 코드는 다음과 같은 출력값을 갖는다. [1, 2, 3] [1, 3, 2] [2, 1, 3] [2, 3, 1] [3, 2, 1] [3, 1, 2]
* 배열의 첫 값부터 순서대로 하나씩 바꾸며 모든 값을 한 번씩 swap한다.
* 간단하고 코드도 깔끔하게 나오지만, 순열들의 순서가 보장되지 않는다.

## visited 배열을 이용한 순열
    import java.util.Scanner;

    public class one_2 {
	
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
* {1, 2, 3, 4} 를 2개씩 순열한 결과값은 무엇일까? 
      
      [1, 2]
      [1, 3]
      [1, 4]
      [2, 1]
      [2, 3]
      [2, 4]
      [3, 1]
      [3, 2]
      [3, 4]
      [4, 1]
      [4, 2]
      [4, 3]
* 위 결과 값에서, 공통점이 있나? for문으로 작성할 수 있을까? 우선 가장 왼쪽의 숫자들은 1~4로 순차 증가한다. 그리고 그 뒤에 값은 자기 자신의 값을 뺀 값이 순차적으로 증가한다.
* 따라서 재귀 부분에서 가장 큰 for문은 i=0에서 arr.length까지 순차적으로 증가한다. 그리고, 넣어준 index i에 해당하는 값을 제외해야 하기 때문에 visited를 true로 바꿔주고, 이를 제외한 것들 중에서 가장 작은 인덱스 값의 배열값이 result에 순차적으로 들어가게 된다. 연산이 끝나 그 전 단계로 돌아가는 것이 visited[i]=flase; 부분이 되겠다. 따라서 깊이에 따라 완전하게 탐색하고, 탐색을 마치고 기저조건에 의해 return을 하면 그 전 값으로 회귀하게 되는 구조를 갖고 있다.


# 중복순열
* 중복 순열은 중복이 없는 순열과 달리, 중복을 허용하고 순서가 있는 순열을 말한다.

## 코드
    import java.util.Scanner;

    public class NM3 {
	    static void mul_permutation(int[] arr, int[] result, int n) {
		    if (n == result.length) {
			    for (int i = 0; i < result.length; i++) {
				    System.out.print(result[i] + " ");
			    }
			    System.out.println();
			    return;
		    }
		
		    for (int i = 0; i < arr.length; i++) {
			    result[n] = arr[i];
			    mul_permutation(arr, result, n + 1);
		    }
	    }

	    public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int N = sc.nextInt();
		    int M = sc.nextInt();

		    int[] arr = new int[N];
		    for (int i = 1; i <= N; i++) {
			    arr[i - 1] = i;
		    }

		    // 중복순열
		    mul_permutation(arr, new int[M], 0);

	    }
    }

* 근데 위 코드는 출력하는 부분 때문에, 시간초과가 날 수 있다. 따라서 string으로 출력하자.
      
      import java.util.Scanner;

      public class NM3 {
	      static void mul_permutation(String result, int n) {
		      if (n == M) {
			      System.out.println(result);
			      return;
		      }
		
		      for (int i = 1; i <=N; i++) {
			      mul_permutation(result+i+" ", n + 1);
		      }
	      }
	
	      static int M;
	      static int N;
	      public static void main(String[] args) {
		      Scanner sc = new Scanner(System.in);
		      N = sc.nextInt();
		      M = sc.nextInt();

		      // 중복순열
		      mul_permutation("", 0);

	      }
      }
