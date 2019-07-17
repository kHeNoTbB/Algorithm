package d1;

import java.util.Scanner;

public class Solution_1933 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int sum=1;
		System.out.print("1 ");
		for(int i=1; i<N+1; i++) {
			sum*=2;
			System.out.print(sum+" ");
		}
		

	}

}
