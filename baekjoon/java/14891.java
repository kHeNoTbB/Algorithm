import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] gear = new String[4+1];
		gear[1] = br.readLine();
		gear[2] = br.readLine();
		gear[3] = br.readLine();
		gear[4] = br.readLine();
		int K = Integer.parseInt(br.readLine());
		for(int k=0; k<K; k++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int rot = Integer.parseInt(st.nextToken()); //1이면 시계, -1이면 반시계
			int[] state = new int[4+1];
			state[num]=rot;
			for(int i=num; i<4; i++) {
				if(gear[i].charAt(2)!=gear[i+1].charAt(6)) {
					state[i+1]=state[i]*-1;
				}
			}
			for(int i=num; i>1; i--) {
				if(gear[i].charAt(6)!=gear[i-1].charAt(2)) {
					state[i-1]=state[i]*-1;
				}
			}
			for(int i=1; i<5; i++) {
				if(state[i]==1) {
					//시계방향
					char last = gear[i].charAt(7);
					gear[i] = last+gear[i].substring(0, 7);
					
				} else if(state[i]==-1) {
					//반시계방향
					char first = gear[i].charAt(0);
					gear[i] = gear[i].substring(1, 8) + first;
				}
			}
		}
		int answer =0;
		for(int i=1; i<5; i++) {
			if(gear[i].charAt(0)=='1') {
				answer+=(int)Math.pow(2, i-1);
			}
		}
		System.out.println(answer);
	}
}
