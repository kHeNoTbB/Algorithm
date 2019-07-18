package algo_week1;

import java.util.Scanner;

public class Gravity {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		int[] room = new int[N];
		int[] ch_room = new int[N];
		int first=0;
		
		for(int j=0; j<N; j++) {
			room[j]=s.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			if(room[i]!=0) {
				first=i;
				break;
			}
		}
		
		int top=0;
		for(int i=0; i<N; i++) 
			if(top<room[i]) top=room[i];
		
		
		for(int i=0; i<N; i++) {
			for(int n=0; n<room[i]; n++) {
				ch_room[n]++;
			}
		}
		
		for(int i=0; i<N; i++) 
			ch_room[i]=(N-first)-ch_room[i];
		
		
		int max=0;
		for(int h=0; h<room[first]; h++) {
			if(ch_room[h]>max) max=ch_room[h];
		}
		
		System.out.println(max);

	}

}
