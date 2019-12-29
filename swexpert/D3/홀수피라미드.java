package D3;

import java.math.BigInteger;
import java.util.Scanner;

public class 홀수피라미드 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			BigInteger bigN, bigLen, bigLeft, bigRight;
			String n = N+"";
			bigN = new BigInteger(n);
			bigLen = bigN.pow(2);
			bigRight = bigLen.multiply(BigInteger.valueOf(2)).subtract(BigInteger.valueOf(1));
			bigLeft = bigRight.subtract(bigN.multiply(BigInteger.valueOf(4)).subtract(BigInteger.valueOf(4)));

			if(N==1)System.out.println("#"+tc+" "+1+" "+1);
			else System.out.println("#"+tc+" "+bigLeft+" "+bigRight);
		}
	}
}

