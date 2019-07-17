package d1;

import java.util.Scanner;

public class Solution_2025 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=0;
		num = scan.nextInt();
		
		int sum=0;
		for(int i=1; i<num+1; i++) {
			sum+=i;
		}
		
		System.out.println(sum);
	}

}
