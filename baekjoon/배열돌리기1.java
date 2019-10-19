import java.util.Scanner;

public class Main {
	static int N, M, R;
	static int[][] map;
	
	static class Point {
		int x;
		int y;
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		R = sc.nextInt();
		map = new int[N][M];
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				map[i][j]=sc.nextInt();
			}
		}
		
		for(int r=0; r<R; r++) {
			rotation();
		}
		printmap(map);
	}
	
	static void rotation() {
		int[][] tmp_map = new int[N][M];
		int num = Integer.min(N, M)/2;
		for(int i=0; i<num; i++) {
			Point start = new Point(i, i);
			Point end = new Point(N-1-i, M-1-i);
			
			//위
			for(int j=start.y+1; j<=end.y; j++) {
				tmp_map[start.x][j-1] = map[start.x][j];
			}
			
			//아래
			for(int j=start.y; j<end.y; j++) {
				tmp_map[end.x][j+1] = map[end.x][j];
			}
			
			//왼쪽
			for(int j=start.x; j<end.x; j++) {
				tmp_map[j+1][start.y] = map[j][start.y];
			}
			
			//오른쪽
			for(int j=start.x+1; j<=end.x; j++) {
				tmp_map[j-1][end.y] = map[j][end.y];
			}
		}
		
		map = tmp_map;
		
		
		
	}
	static void printmap(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
	}
}
