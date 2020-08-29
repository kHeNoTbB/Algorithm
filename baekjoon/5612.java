import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); //조사한 시간
		int res = Integer.parseInt(br.readLine()); //터널 안에 들어있는 차량의 수
		
		int MAX = 0;
		StringTokenizer st = null;
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			res += Integer.parseInt(st.nextToken());
			res -= Integer.parseInt(st.nextToken());
			if(res<0) {
				System.out.print(0);
				return;
			}
			else MAX = Math.max(MAX, res);
		}
		System.out.print(MAX);
	}
}
