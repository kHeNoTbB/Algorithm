package D4;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class 자기방으로돌아가기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int student = sc.nextInt();
			
			//홀수랑 짝수랑 합쳐서 생각하기
			//List<Integer> room = new LinkedList<>();
			int[] room = new int[401];
			
			for(int i=0; i<student; i++) {
				int start = sc.nextInt();
				int end = sc.nextInt();
				
				//홀수를 짝수로 만들기
				if(start%2==1) start+=1;
				if(end%2==1) end+=1;
				
				if(start>end) {
					int tmp = end;
					end = start;
					start = tmp;
				}
				
				
				//room.add(start);
				//room.add(end);
				for(int k=start; k<=end; k++) {
					room[k]++;
				}
			}
			
			int cnt = 0;
//			for(int i=0; i<room.length; i++) {
//				if(room[i]>1) cnt++;
//			}
			Arrays.sort(room);
			cnt = room[room.length-1];
			
			
			System.out.println("#"+tc+" "+cnt);
		}
	}
}

