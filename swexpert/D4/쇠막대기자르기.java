package D4;


import java.util.Scanner;
//import java.util.Stack;

public class 쇠막대기자르기 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int ts = s.nextInt();
		for (int T = 0; T < ts; T++) {
			String str = s.next(); // ()(((()())(())()))(())

			//Stack<Character> stack = new Stack<>();
			int a = 0;
			int b = 0;

			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);

				if (c == '(') {
					if (str.charAt(i+1) == ')') {
						i++;
						a += b;
					}else {a++;b++;}
				} 
				else b--;
				
			}
			
			System.out.println("#"+(T+1)+" "+a);
		}

	}

}
