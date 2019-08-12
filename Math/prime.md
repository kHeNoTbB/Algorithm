# 소수
## 모든 숫자로 나눠보는 방법으로 소수를 구해보기
    public class 소수찾기 {
	    public static void main(String[] args) {
		    // 1. 위 모든 숫자로 나눠보는 방법으로 수수들을 구해봅시다.
		    for (int i = 2; i <= 100; i++) {
			    boolean isPrime = true;
			    for (int j = 2; j < i; j++) {
				    if (i % j == 0)
					    isPrime = false;
			    }
			    if (isPrime)
				    System.out.print(i + " ");
		    }
	    }
    }

## 에라토스테네스의 체  
    import java.util.Scanner;

    public class 소수찾기 {
	    public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int N = sc.nextInt();
		
		    // 필요한 크기의 boolean 배열을 준비한다.
		    boolean[] isNotPrime = new boolean[N+1];
		
		    // 4 6 8 10 ... 번째 인덱스에 false
		    // 6 9 12 ... 번째 인덱스에 false
		    // 8 12 16 ... 번째 인덱스에 false
		    // 이 짓을 n의 제곱근까지 Math.sqrt(n);
		    for(int i=2; i<=Math.sqrt(N); i++) { // or i*i<=100
			    for(int j=2; i*j<=100; j++) {
				    isNotPrime[i*j]= true;
			    }
		    }
		    for (int i = 2; i < isNotPrime.length; i++) {
			    if(!isNotPrime[i]) System.out.print(i+" ");
			
		    }
	    }
    }

### [boj] 1929 소수 구하기
    import java.util.Scanner;

    public class Main {
	    public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int f = sc.nextInt();
		    int N = sc.nextInt();

		    boolean[] isNotPrime = new boolean[N+1];

		    for(int i=2; i<=Math.sqrt(N); i++) { 
			    for(int j=2; i*j<=N; j++) {
				    isNotPrime[i*j]= true;
			    }
		    }
		    for (int i = f; i < isNotPrime.length; i++) {
			    if(!isNotPrime[i]) {
				    if(i==1) continue;
				    System.out.print(i+" ");
			    }
			
		    }
	    }
    }

