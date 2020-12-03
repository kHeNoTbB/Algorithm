import java.util.*;
public class Main {
	public static void main(String[] args) {
		int answer = 0;
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine().trim();
		int S = Integer.parseInt(num.split(" ")[1]); //string보다 그냥 원래 하던대로 int[] 로 연산하는 것이 빠르다.
		String[] arr = sc.nextLine().split(" ");
		
		for(int i=0; i<(1<<arr.length); i++) { // i=1부터 시작하면 공백 안들어가므로 flag를 따로 쓰지 않아도 된다.
			int sum = 0 ;
			boolean flag = false;
			for(int j=0; j<arr.length; j++) {
				if((i&(1<<j))!=0) {
					flag = true;
					sum += Integer.parseInt(arr[j]);
				}
			}
			if(flag&&sum==S) answer++;
		}
		System.out.println(answer);
	}
}
