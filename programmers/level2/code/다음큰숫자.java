public class Solution {
	public int solution(int n) {
		int answer = 0;
		int ncnt = fun(n);
		for(int i=n+1; i<=1000000; i++) {
			if(ncnt==fun(i)) {
				answer=i;
				break;
			}
		}
		return answer;
	}
	public int fun(int n) {
		int n_cnt = 0;
		while (true) {
			if(n==0) break;
			else {
				if(n%2==1) n_cnt++;
				n/=2;
			}
		}
		return n_cnt;
	}
}
