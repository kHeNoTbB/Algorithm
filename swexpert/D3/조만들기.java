package D3;


import java.util.Arrays;
import java.util.Scanner;

public class 조만들기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt(); //4
			int K = sc.nextInt(); //6
			int[] group = new int[K+1];
			
			int flag=1; int start=1; int num=1;
			for(int i=1; i<=N; i++) {
				if(flag==1) {
					for(int j=start; j<start+K; j++)
						{group[(j-1)%K]+=num; num++; }
					start+=K;flag=0;
				}
				else if(flag==0) {
					for(int j=start+K-1; j>=start; j--)
						{group[(j-1)%K]+=num; num++;}
					start+=K;flag=1;
				}
			}
			
			System.out.printf("#"+tc);
			for(int i=0; i<K; i++)
				System.out.printf(" %d",group[i]);
			System.out.println();
			
		}
	}
}

