package D3;

import java.util.Scanner;

public class 다솔이의다이아몬드장식 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			String str = sc.next();
            
			System.out.print(".");
			for(int i=0; i<str.length(); i++) {
				System.out.print(".#..");
			} System.out.println();
			
			System.out.print(".");
			for(int i=0; i<str.length(); i++) {
				System.out.print("#.#.");
			}System.out.println();
			
			System.out.print("#");
			for(int i=0; i<str.length(); i++) {
				System.out.print("."+str.charAt(i)+".#");
			}System.out.println();
			
			
			System.out.print(".");
			for(int i=0; i<str.length(); i++) {
				System.out.print("#.#.");
			}System.out.println();
				
			System.out.print(".");
			for(int i=0; i<str.length(); i++) {
				System.out.print(".#..");
			} System.out.println();

		}
	}
}
