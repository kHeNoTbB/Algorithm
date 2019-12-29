package D3;

import java.util.Arrays;
import java.util.Scanner;

public class 정곤이의단조증가하는수 {
	public static int incre(String str) {
		int len = str.length();
		int flag=0;
		for(int i=0; i<len-1; i++) {
			if((str.charAt(i)-'0')>(str.charAt(i+1)-'0')) {flag=1; break;}
			else {}
		}
		if(flag==1) return 2;
		else return 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n=sc.nextInt();
			int[] arr = new int[n];
			for(int i=0; i<n; i++)
				arr[i]=sc.nextInt();
			Arrays.sort(arr);
			int max=-1;
			for(int i=0; i<arr.length-1; i++)
				for(int j=1+i; j<arr.length; j++)
					if(incre(arr[i]*arr[j]+"")==1 && max<arr[i]*arr[j]) max=arr[i]*arr[j];
 
			System.out.println("#"+tc+" "+max);
		}
	}
}
