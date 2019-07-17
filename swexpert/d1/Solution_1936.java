package d1;

import java.util.Scanner;

public class Solution_1936 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=0;
		int b=0;
		a = scan.nextInt();
		b = scan.nextInt();
		//1:가위, 2:바위, 3:보
		if(a==1 && b==2) System.out.println("B");
		if(a==1 && b==3) System.out.println("A");
		if(a==2 && b==3) System.out.println("B");
		if(b==1 && a==2) System.out.println("A");
		if(b==1 && a==3) System.out.println("B");
		if(b==2 && a==3) System.out.println("A");
		
		
	}

}
