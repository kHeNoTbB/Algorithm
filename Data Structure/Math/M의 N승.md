# M의 N승

### M을 N번 곱하는 간단한 방법

```
public static int solution(int M, int N) {
	int res = 1;
	for(int i=1; i<=N; i++) {
		res *=M;
	}
	return res;
}
```



### 재귀 (LogN)

```
public static int solution(int M, int N) {
	if(N==0) return 1;
	else if(N==1) return M;
		
	if(N%2==0) { //짝수이면?
		return solution(M*M, N/2);
	} else {
		return M * solution(M*M, N/2);
	}
}
```

짝수이면 기본적으로 제곱을 가지고 있으므로, 제곱을 한 수와 제곱을 뺀 수로 나뉘어 들어가게 된다. 만약 3^8을 구한다면 (3^2, 4) ... 이런식으로 가면 최종적으로 3->9->81->6561가 될 수 있다.

홀수의 경우에는 짝수로 맞춰주기 위해 하나를 바깥으로 뺀다. 
