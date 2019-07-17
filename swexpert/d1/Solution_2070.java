package d1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_2070 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testcase=0;
		testcase = scan.nextInt();
		
		for(int i=0; i<testcase; i++) {
			int[] arr = new int[10];
			for(int j=0; j<10; j++)
				arr[j]=scan.nextInt();
			Arrays.sort(arr);
			System.out.println("#"+(i+1)+" "+arr[9]);
				
		}

	}

}
