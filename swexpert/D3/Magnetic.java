package D3;

import java.util.Scanner;

public class Magnetic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();

			int[][] map = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.nextInt();
				}
			}

			int flag = 0;
			for (int j = 0; j < N; j++) {
				for(int i=0; i<N; i++) {
					if(map[i][j]!=0) {
						if(map[i][j]==2) map[i][j]=0;
						else {
							flag=1;
							break;
						}
					}
				}
				for(int i=N-1; i>=0; i--) {
					if(map[i][j]!=0) {
						if(map[i][j]==1) map[i][j]=0;
						else {
							flag=1;
							break;
						}
					}
				}
			}

			int hit = 0;
			int answer=0;
			for(int j=0; j<N; j++) {
				for(int i=0; i<N; i++) {
					if(map[i][j]==1) {
						hit=1;
					}
					else if(hit==1 && map[i][j]==2) {
						answer++;
						hit=0;
					}
				}
			}
			System.out.println("#" + tc + " "+answer);
		}
	}
}

