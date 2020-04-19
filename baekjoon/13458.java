/*
 * 문자열 처리는 bufferedReader를 사용하면 실행시간 뿐만 아니라, 메모리도 줄일 수 있다.
 * StringTokenizer로 데이터를 받고, nextToken()을 사용해 데이터 간 공백을 땡겨 데이터를 읽는다.
 * 버퍼를 사용하지 않는 입력은 키보드 입력이 키를 누르는 즉시 바로 전달된다.
 * 하지만 버퍼를 사용하면 키보드 입력 시 한 문자씩 버퍼로 전송하고, 버퍼가 가득 차거나 개행문자 입력시에 한번에 전송한다.
 * 
 * Scanner 
 * - 알아서 tokenizing과 parsing을 처리한다.
 * - 즉, 정규식을 이용해서 입력 값을 검사하는 과정이 있다.
 * - 예를 들면, sc.nextInt()의 경우 공백단위로 알아서 끊어서 넣어준다.
 * - 하지만, 이를 처리하는데에 시간을 많이 잡아먹는다.
 */
import java.util.*;
import java.io.*;
public class 시험감독 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N =Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer bc = new StringTokenizer(br.readLine());
		int B = Integer.parseInt(bc.nextToken());
    	int C = Integer.parseInt(bc.nextToken());
		long result = N;
		for(int a=0; a<N; a++) {
			int s = Integer.parseInt(st.nextToken());
			if((s-=B)>0) result += s%C==0?s/C:s/C+1;
		}
		System.out.print(result);
	}
}
