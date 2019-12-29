package D3;

import java.util.Scanner;

public class 현주의상자바꾸기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			int Q = sc.nextInt();
			int[] box = new int[N+1];
		
			for(int i=1; i<=Q; i++) {
				int start=sc.nextInt();
				int end=sc.nextInt();
				for(int j=start; j<=end; j++) {
					box[j]=i;
				}
			}
			System.out.format("#%d", tc);
            for(int i=1; i<=N; i++) {
                System.out.format(" %d", box[i]);
            }
            System.out.println();
        }
			
		}
	}

