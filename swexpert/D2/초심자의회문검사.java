package D2;

import java.util.Scanner;

public class 초심자의회문검사 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int ts = s.nextInt();
		for (int T = 0; T < ts; T++) {
			int result = 0;
			String str = s.next();

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == str.charAt(str.length() - (i + 1))) {
					result = 1;
				} else
					result = 0;

			}

			System.out.println("#" + (T + 1) + " " + result);
		}
	}
}
