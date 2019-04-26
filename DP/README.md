### DP(Dynamic Programming, 다이나믹 프로그래밍)
#### 주어진 문제의 특정 값을 구하기 위해 부분 문제의 정답을 한 번만 계산하여 저장하고, 이를 활용하는 효율적인 알고리즘


    #include <Stdio.h>
    int fibonacci(int n) {
    	if (n == 1 || n == 2) return 1;
    	else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    int main(void) {
	    printf("%d", fibonacci(10));
	    return 0;
    }
    
위의 피보나치 소스코드를 보면, fibonacci(10)을 계산하기 위해서 fibonacci(9)와 fibonacci(8)을 호출한다. 
이것이 반복되면 결국 아래와 같이 계속적인 재귀형태로 fibonacci()를 중복호출(2^n 번)하게 된다.

이때 계산된 값은 배열에 저장하고, 중복 호출 시에 이를 활용하여 빠른 연산을 도울 수 있다.

    #include <Stdio.h>
    int f[100] = { 0, };

    int fibonacci(int n) {
    	if (f[n] != 0) return f[n];
    	else {
	    	if (n == 1 || n == 2) return 1;
    		else return f[n] = fibonacci(n - 1) + fibonacci(n - 2);
    	}
    }

    int main(void) {
    	printf("%d", fibonacci(10));
    	return 0;
    }


