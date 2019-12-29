package D3;

import java.util.Scanner;

public class 다양성측정 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int num = sc.nextInt();
			int[] arr = new int[10];
			
			while(num!=0) {
				arr[num%10]++;
				num/=10;
			}
			
			int answer=0;
			for(int i=0; i<10; i++)
				if(arr[i]!=0) answer++; 
			
			
			System.out.println("#"+tc+" "+answer);
		}
	}
}
