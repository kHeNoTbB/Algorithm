class Solution {
   public String solution(String number, int k) {
		StringBuilder answer = new StringBuilder();
       int[] num = new int[number.length()];
		for (int i = 0; i < number.length(); i++) {
			num[i] = number.charAt(i) - '0';
		}
		int start = 0;
		int end = k;
		while (true) {
			int max = -1;
			int idx = 0;
			for (int i = start; i <= end; i++) {
				if (max < num[i]) {
					max = num[i];
					idx = i;
				}
			}
			start = idx + 1;
      answer.append(max);
			end++;
			if (answer.length() == num.length - k) break;
		}
		return answer.toString();
	}
}
