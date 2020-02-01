package 모의SW역량테스트;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미생물격리 {
	static class Node {
		int r, c, num, dir;
		public Node(int r, int c, int num, int dir) {
			this.r = r;
			this.c = c;
			this.num = num;
			this.dir = dir;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N =sc.nextInt();
			int M =sc.nextInt();
			int K =sc.nextInt();
			int res = 0;
			Queue<Node> bugs = new LinkedList<>();
			
			for(int k=0; k<K; k++) {
				int r = sc.nextInt();
				int c = sc.nextInt();
				int num =sc.nextInt();
				int dir = sc.nextInt();
				bugs.add(new Node(r, c, num, dir));
			}
			
			for(int m=0; m<M; m++) {
				int size = bugs.size();
				for(int i=0; i<size; i++) {
					Node newbug = move(bugs.poll());
					
					if(newbug.r==0 || newbug.c==0 || newbug.r == N-1 || newbug.c == N-1) {
						if(newbug.dir==1) newbug.dir=2;
						else if(newbug.dir==2) newbug.dir=1;
						else if(newbug.dir==3) newbug.dir=4;
						else if(newbug.dir==4) newbug.dir=3;
						
						newbug.num/=2;
						bugs.add(newbug);
					} 
					else bugs.add(newbug);
				}

				size = bugs.size();
				Node[][] rem = new Node[N][N];
				int[][] sum = new int[N][N];
				for(int i=0; i<size; i++) {
					Node bug = bugs.poll();
					if(rem[bug.r][bug.c] != null ) {
						if(rem[bug.r][bug.c].num < bug.num)
							rem[bug.r][bug.c] = bug;
					} 
					else rem[bug.r][bug.c] = bug;
					sum[bug.r][bug.c]+=bug.num;
				}
				
				for(int i=0; i<rem.length; i++) {
					for(int j=0; j<rem.length; j++) {
						if(rem[i][j]!=null) {
							rem[i][j].num = sum[i][j];
							bugs.add(rem[i][j]);
						}
					}
				}
			}

			int size = bugs.size();
			for(int i=0; i<size; i++)
				res+= bugs.poll().num;
			System.out.println("#"+tc+" "+res);
		}
	}
	static Node move(Node bug) {
		if(bug.dir==1) bug.r -= 1;
		else if(bug.dir==2) bug.r += 1;
		else if(bug.dir==3) bug.c -=1;
		else if(bug.dir==4) bug.c +=1;
		
		return bug;
	}

}
