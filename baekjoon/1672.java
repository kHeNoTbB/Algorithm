import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char[] c = br.readLine().toCharArray();
		
		char[][] map = new char[21][21];
		map[1][1] = map[7][20] = map[20][7] = map[1][3] = map[3][1] = 65;
		map[3][3] = map[1][7] = map[7][1] = 67;
		map[7][7] = map[3][20] = map[20][3] = map[1][20] = map[20][1] = 71;
		map[20][20] = map[3][7] = map[7][3] = 84;		
				
		for(int i=c.length-1; i>0; i--) {
			c[i - 1] = map[c[i - 1] - 64][c[i] - 64];
		}
		
		System.out.println(c[0]);
	}
}
