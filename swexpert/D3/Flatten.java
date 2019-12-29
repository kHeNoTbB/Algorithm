package D3;

import java.util.Arrays;
import java.util.Scanner;
public class Flatten {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			int dump = sc.nextInt();
			int[] box_high = new int[100];
			
			for(int j=0; j<box_high.length; j++) 
				box_high[j] = sc.nextInt();
			
			Arrays.sort(box_high);
			int max=0;
			int min=100;		 
			
			while(dump!=0) {
				Arrays.sort(box_high);
				box_high[99]--;
				box_high[0]++;
				
				dump--;
			}
			Arrays.sort(box_high);
			System.out.println("#"+(i+1)+" "+(box_high[99]-box_high[0]));
		}
	}
}
