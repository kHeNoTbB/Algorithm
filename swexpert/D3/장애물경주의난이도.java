package D3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class 장애물경주의난이도 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int num = sc.nextInt();
			List<Integer> list = new LinkedList<>();
			int min=0;
			int max=0;
			
			for(int i=0; i<num; i++) {
				list.add(sc.nextInt());
			}

			for (int i = 0; i < num-1; i++) {
				if(min>list.get(i)-list.get(i+1)) min = list.get(i)-list.get(i+1);
				if(max<list.get(i)-list.get(i+1)) max = list.get(i)-list.get(i+1);		
			}
			System.out.println("#"+tc+" "+Math.abs(min)+" "+max);
		}
	}
}

