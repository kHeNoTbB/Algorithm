import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int[][] map, dust;
	static int R, C, T;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		R = sc.nextInt();
		C = sc.nextInt();
		T = sc.nextInt(); // T초가 지난 후.
		map = new int[R][C];
		

		ArrayList<Integer> air = new ArrayList<>();
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = sc.nextInt();
				if (map[i][j] == -1)
					air.add(i);
			}
		}
		
		
		
		for (int t = 0; t < T; t++) {
			dust = new int[R][C];
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if (map[i][j] > 0) {
						dust(i, j);
					}
				}
			}

			for (int i = 0; i < dust.length; i++) {
				for (int j = 0; j < dust[i].length; j++) {
					if (dust[i][j] != 0) {
						map[i][j] += dust[i][j];
					}
				}
			}
			//printmap(map);
			// 공기청정기가 있는 x좌표 두개를 넘겨줌
			wind_up(air.get(0));
			wind_down(air.get(1));
			//map=wind;
			
		}
		
		// 미세먼지 양 출력
		long dust_sum = 0;
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				if(map[i][j]!=-1 && map[i][j]!=0) {
					dust_sum += map[i][j];
				}
			}
		}
		System.out.println(dust_sum);
	}

	static int[] dr = { 0, 0, -1, 1 };
	static int[] dc = { 1, -1, 0, 0 };
	
	static void dust(int r, int c) {
		int N = 0;
		
		for (int i = 0; i < 4; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];

			if (nr >= 0 && nr < map.length && nc >= 0 && nc < map[nr].length && map[nr][nc] != -1) {
				dust[nr][nc] += (map[r][c] / 5);
				N++;
			}
		}
		dust[r][c] -= (map[r][c] / 5) * N;
		/*for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				map[i][j] = dust[i][j];
			}
		}*/
	}

	static int[][] wind;
	static void wind_up(int a) {

		// up 할 때 초기화(새로 생성)
		wind = new int[R][C];

		// 미세먼지 순환
		// 왼쪽
		for (int i = 0; i < a - 1; i++) {
			wind[i + 1][0] = map[i][0];
		}

		// 위
		for (int i = 1; i < C; i++) {
			wind[0][i - 1] = map[0][i];
		}

		// 오른쪽
		for (int i = 1; i <= a; i++) {
			wind[i - 1][C - 1] = map[i][C - 1];
		}

		// 아래
		for (int i = 1; i < C-1; i++) {
			wind[a][i + 1] = map[a][i];
		}

		// 공기청정기 위치와, 사라진 미세먼지 위치
		wind[a][0] = -1;
		wind[a][1] = 0;
		
		
		for(int i=1; i<a; i++) {
			for(int j=1; j<map[i].length-1; j++) {
				wind[i][j]=map[i][j];
			}
		}
	}

	static void wind_down(int a) {
		// 미세먼지 순환
		// 위
		for (int i = 1; i < C-1; i++) {
			wind[a][i + 1] = map[a][i];
		}
		

		// 오른쪽
		for (int i = a; i < R - 1; i++) {
			wind[i + 1][C - 1] = map[i][C - 1];
		}

		// 아래
		for (int i = 1; i < C; i++) {
			wind[R-1][i - 1] = map[R-1][i];
		}

		// 왼쪽
		for (int i = a+2; i < R; i++) {
			wind[i - 1][0] = map[i][0];
		}

		// 공기청정기 위치와, 사라진 미세먼지 위치
		wind[a][0] = -1;
		wind[a][1] = 0;
		
		for(int i=a+1; i<R-1; i++) {
			for(int j=1; j<map[i].length-1; j++) {
				wind[i][j]=map[i][j];
			}
		}
		
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				map[i][j]=wind[i][j];
			}
		}
		
		
		
	}

	static void printmap(int[][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}

}
