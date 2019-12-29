package D3;

import java.util.Scanner;

public class 세상의모든팰린드롬2 {
	static boolean ispal(String str) {
		int p =0;
		int q = str.length()-1;
		
		while(p<q) {
			if(str.charAt(p)!=str.charAt(q)) {
				if(str.charAt(p)=='*') {
					q-=1;
				}
				else if(str.charAt(q)=='*') {
					p+=1;
				}
				else return false;
			}
			else {
				p+=1;
				q-=1;
			}
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			String answer="";
			String tmp = sc.next();
			if(ispal(tmp)) answer="Exist";
			else answer="Not exist";
			
			System.out.println("#"+tc+" "+answer);
		}
	}
}

