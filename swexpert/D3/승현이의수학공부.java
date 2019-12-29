package D3;

import java.util.Scanner;

public class 승현이의수학공부 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int n = sc.nextInt();
			String x = sc.next();
			int result = 0;	
			for(int i=0; i<x.length(); i++) result+=(x.charAt(i)-'0');
			System.out.println("#"+tc+" "+result%(n-1));
		}
	}
}
