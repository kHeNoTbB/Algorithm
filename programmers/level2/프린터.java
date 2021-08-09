import java.util.*;
class Solution {
    static class Node{
		int idx; //원래순서
		int pri; //우선순위
		Node(int idx, int pri) {
			this.idx = idx;
			this.pri = pri;
		}
	}
    public static int solution(int[] priorities, int location) {
		
		Queue<Node> pq = new LinkedList<>();
		int[] done = new int[priorities.length]; //프린트 한 순서 작성
		int doneCnt = 1;						 //들어갈 때마다 1++;

		for(int i=0; i<priorities.length; i++) {
			pq.add(new Node(i, priorities[i]));
		}
		
		while(pq.size()!=1) {
			Node peek = pq.poll();
			
			boolean flag = false;
			int size = pq.size();
			for(int i=0; i<size; i++) {
				Node tmp = pq.poll();
				if(peek.pri < tmp.pri) { //단하나라도 큰게 있다면?
					flag = true;
					
				}
				pq.add(tmp);
			}
			if(flag) { //단 하나라도 큰게 있다면
				pq.add(peek);
				
			} else {
				done[peek.idx] = doneCnt++;
			}
		}
		
		done[pq.peek().idx] = doneCnt++;
		return done[location];
	}
}
