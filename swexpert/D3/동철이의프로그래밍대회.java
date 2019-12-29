package D3;

import java.util.Arrays;
import java.util.Scanner;

public class 동철이의프로그래밍대회 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int num = sc.nextInt();
			int problem = sc.nextInt();
			
			int sum = 0;
			int[] arr = new int[num];
			int j=0;
			
			for(int i=0; i<problem*num; i++) {
				if(i!=0&&i%problem==0) j++;
				arr[j] += sc.nextInt();
			}
			Arrays.sort(arr);
			int max = arr[arr.length-1];
			int cnt=1;
			for(int i=0; i<num-1; i++) if(max==arr[i]) cnt++;
			System.out.println("#"+tc+" "+cnt+" "+max);
		}
	}
}

