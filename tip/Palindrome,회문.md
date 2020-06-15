# Palindrome 회문

회문에 관련된 문제는 크게 두가지로 볼 수 있다. 회문이 맞는지 아닌지 판별하는 문제와, 부분 문자열 중 가장 긴 회문을 찾는 문제이다.



## 팰린드롬 판별하기

```
public static boolean isPalindrome(String string) {
	int p = 0;
	int q = string.length() - 1;
	while (p < q) {
		if (string.charAt(p) != string.charAt(q))
			return false;
		p += 1;
		q -= 1;
	}
	return true;
}
```



## 부분 문자열 중 가장 긴 팰린드롬의 길이

```
//https://programmers.co.kr/learn/courses/30/lessons/12904
public class Solution {
	public static void main(String[] args) {
		//System.out.println(solution("abcdcba"));
		System.out.println(solution("abacd"));
		//System.out.println(solution("abab"));
		//System.out.println(solution("banana"));
		//System.out.println(solution("abacaba"));
	}
	
	public static int solution(String s) {
        for (int answer = s.length(); answer > 1; answer--) {
            int start = 0;
            int end = answer - 1;

            while (end < s.length()) {
                if (isPalindrome(s, start, end)) {
                    return answer;
                }
                start++;
                end++;
            }
        }
        return 1;
    }

	public static boolean isPalindrome(String string, int p, int q) {
		while (p < q) {
	    	if (string.charAt(p++) != string.charAt(q--))
		    	return false;
	    }
    	return true;
	}
}
```

