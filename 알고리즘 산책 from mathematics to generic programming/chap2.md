#### 2.1 이집트인의 곱셈

    int multiply0(int n, int a) {
	if(n==1) retrun a;
	return multiply0(n-1, a) + a;
    }

예를 들어서 n=4, a=5라고 해보자.<br>
multiply0(3, 5) + 5<br>
multiply0(2, 5) + 5 + 5<br>
multiply0(1, 5)=5 + 5 + 5 + 5<br>

이렇게, a=5를 n=4번 반복한 것이 multiply0의 곱셈이다.

