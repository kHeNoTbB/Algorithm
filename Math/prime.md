# 소수
## 모든 숫자로 나눠보는 방법으로 소수를 구해보기
    public class 소수찾기 {
	    public static void main(String[] args) {
		    for (int i = 2; i <= 100; i++) {
			    int flag = 0;
			    for (int j = 2; j <= i; j++) {
				    if (i % j == 0)
					    flag++;
			    }
			    if (flag == 1)
				    System.out.print(i + " ");
		    }
	    }
    }
