import java.util.*;
/*
 * https://www.acmicpc.net/problem/9012
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for(int tc=0; tc<TC; tc++) {
			Stack<Character> stack = new Stack<>();
			for(char c : sc.next().toCharArray()) {
				if(!stack.isEmpty() && c==')' && stack.peek()=='(') stack.pop();
				else stack.add(c);
			}
			System.out.println(stack.isEmpty() ? "YES" : "NO");
		}
	}
}
