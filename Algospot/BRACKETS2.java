import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		String s = "({[";
		String e = ")}]";
		for(int tc=0; tc<TC; tc++) {
			Stack<Character> stack = new Stack<>();
			for(char c : sc.next().toCharArray()) {
				if(!stack.isEmpty() && e.contains(c+"")) { //닫는 태그일때
					if(s.indexOf(stack.peek())==e.indexOf(c)) {
						stack.pop();
					}
				} else {
					stack.add(c);
				}
			}
			System.out.println(stack.isEmpty()?"YES":"NO");
		}
	}
}
