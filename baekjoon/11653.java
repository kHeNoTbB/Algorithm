import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int N = A;
		StringBuilder sb = new StringBuilder();
		loop:for(int i=2; i<=N; i++) {
			while(A%i==0) {
				if(A==0) break loop;
				sb.append(i+"\n");
				A/=i;
			}
		}
		System.out.print(sb);
	}
}
