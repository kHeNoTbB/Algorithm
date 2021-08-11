package programmers;

/*
 * 이 문제는 최대공약수를 구할 수 있는지, 그리고 규칙을 찾을 수 있는지 묻는 문제다.
 * 최대공약수에 대한 목습은 math 폴더에서 할 수 있다. https://github.com/kHeNoTbB/Algorithm/blob/master/Math/README.md
 */

public class 멀쩡한사각형 {
	class Solution {
		public long solution(long w,long h) {
			//작은 수, 큰 수
	        long s = Math.min(w, h);
	        long b = Math.max(w, h);
	        
	        //최대공약수??
	        long gc = gcd(b, s);
	        
	        //계산
	        long answer = (w*h) - (w+h-gc);
	        return answer;
		}
	    
	    public long gcd(long b, long s) {
	        if(b%s==0) return s;
	        return gcd(s, b%s);
	    }
	}
}
