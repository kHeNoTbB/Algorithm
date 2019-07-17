package d1;

import java.util.Scanner;

public class Solution_1938 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=0;
		int b=0;
		a = scan.nextInt();
		b = scan.nextInt();
		int tmp=0;
		
		if(a<b) {
			tmp=a;
			a=b;
			b=tmp;
		}
		System.out.println(a-b+1);
		
	}

}
