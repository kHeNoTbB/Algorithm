import java.util.*;
class Solution {
    public static boolean solution(String s) {		
		Stack<Character> stack = new Stack<>();
		for(char c : s.toCharArray()) {
			if(!stack.isEmpty() && c == ')' && stack.peek()=='(') {
				stack.pop();
			} else {
				stack.add(c);
			}
		}
		return stack.isEmpty()?true:false;
	}
}
