package D2;

import java.util.Scanner;

public class 패턴마다의길이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		
		for(int tc = 0; tc<T; tc++) {
		
		String str = sc.next();

		int res = 0;
		
		for (int j = 2; j < str.length() / 2; j++) {
			int cnt = 0;
			for (int i = 0; i < j; i++) {
				if (str.charAt(i) == str.charAt(i + j))
					cnt++;
				else
					break;
			}
			if(cnt==j) {
				res = j;
				break;
			}
		}System.out.println("#" + (tc+1)+ " " +res);
		}

	}

}

