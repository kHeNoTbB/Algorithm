import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] b = new int[2*N];
		boolean[] r = new boolean[2*N];
		for(int i=0; i<b.length; i++)
			b[i] = Integer.parseInt(st.nextToken());
		
			
		int level = 0;
		while(true) {			
			level++;
			
			//(1)벨트가 한 칸 회전한다.
			int tmp = b[2*N-1];
			for(int i=2*N-1; i>0; i--) {
				b[i] = b[i-1];
			}
			b[0] = tmp;
			
			boolean tmp2 = r[2*N-1];
			for(int i=2*N-1; i>0; i--) {
				r[i] = r[i-1];
			}
			r[0] = tmp2;
			
			
			//(2)(움직일 칸 로봇없고 내구성 1 이상이면)벨트 위 로봇들이 한칸 움직인다.
			//내려가는 로봇
			if(r[N-1]) r[N-1]=false;
			
			//그 외 로봇
			for(int i=N-2; i>=0; i--) {
				if(r[i] && b[i+1]>0 && !r[i+1]) {
					r[i] = false;
					r[i+1] = true;
					b[i+1]--;
				}
			}
			
			//(3)올라가는 위치에 로봇 없으면 로봇이 올라간다.
			if(!r[0] && b[0]>0) {
				r[0] = true;
				b[0]--;
			}
			if(r[N-1]) r[N-1]=false;
			
			//(4)내구도 0인 칸의 개수가 k개 이상이면 종료
			int cnt = 0;
			for(int i=0; i<b.length; i++) {
				if(b[i]<=0) cnt++;
			}
			
			
			if(cnt>=K) break;
		}
		
		System.out.print(level);
	}
}
