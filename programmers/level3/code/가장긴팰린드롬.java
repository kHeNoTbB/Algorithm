class Solution
{
	public int solution(String s) {
        for (int answer = s.length(); answer > 1; answer--) {
            int start = 0;
            int end = 0 + answer - 1;

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
	
	public boolean isPalindrome(String string, int p, int q) {
	    while (p < q) {
	    	if (string.charAt(p++) != string.charAt(q--))
		    	return false;
	    }
    	return true;
	}
}
