package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 조합 {
	static int p = 1234567891;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		
		for(int tc=1; tc<=T; tc++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int n = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			
			long fac[] = new long[n+1]; //1부터 n까지의 팩토리얼 구하기
			fac[1] = 1; //0 팩토리얼은 1임
			for(int i=2; i<fac.length; i++) {
				// 1! = 1 * 0!
				// 2! = 2*1!
				// 3! = 3 * 2!
				fac[i] = (fac[i-1] * i) % p;
			}
						
			long nfac = fac[n];
			long nrfac = fac[n-r];
			long rfac = fac[r];
			
			long answer = nfac * pow( nrfac * rfac % p , p-2) %p;
			System.out.println("#"+tc+" "+answer);
		}
	}
	static long pow(long n, int x) {
		if (x == 1) return n;
		long pow_temp = pow(n, x/2);
		if(x%2==0) return (pow_temp * pow_temp) %p ;
		else return ((pow_temp* pow_temp)%p *n ) %p ;
        
	}
	
}
