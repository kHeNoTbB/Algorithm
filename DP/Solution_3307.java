package algo_week1;

import java.util.Scanner;

public class Solution_3307 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int test=1;
		
		while(T!=0) {
			int max=0;
			int num = sc.nextInt();
			int[] arr = new int[num];
			int[] dp = new int[num];
			
			for(int i=0; i<arr.length; i++) 
				arr[i] = sc.nextInt();
			
			for(int i=1; i<arr.length; i++) {
				//dp[i]=1;
				for(int j=0; j<i; j++) {
					if (arr[i] > arr[j] && dp[i] <= dp[j])
	                    dp[i] = dp[j] + 1;
	                else if (arr[i] == arr[j])
	                    dp[i] = dp[j];
				}	
			}
			

//			for(int i=0; i<num; i++)
//				System.out.print(dp[i]+" ");
			
			for(int i=0; i<arr.length; i++) {
				if(max<dp[i]) {
					//System.out.println(max);
					max=dp[i];
				}
				//else if (max>dp[i]) count=0;
			}
			
			System.out.println("#"+test+" "+(max+1));
			T--;
			test++;
		}
		
		

	}

}
