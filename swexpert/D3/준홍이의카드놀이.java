package D3;

import java.util.Arrays;
import java.util.Scanner;

public class 준홍이의카드놀이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] arr = new int[N+M+1];
			
			for(int i=1; i<=N; i++) {
				for(int j=1; j<=M; j++) {
					arr[i+j]++;
				}
			}
			
			int max=arr[1];
			for(int i=2; i<arr.length; i++) {
				if(max<arr[i]) max=arr[i];
			}
			
			
			System.out.print("#"+tc+" ");
			for(int i=1; i<arr.length; i++) 
				if(max==arr[i]) System.out.print(i+" ");
			System.out.println();
		}
	}
}
