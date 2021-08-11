/*
(1) Queue를 이용하는 방법 -> 우선순위 큐(PriorityQueue)
(2) List를 이용하는 방법 -> sort 하는데에서 복잡도 올라갈듯?
(3) Set를 이용하는 방법 -> TreeSet(자동정렬) -> 하지만 빼는 연산이 복잡함

뭔가 이전에 풀었던 코드보다 ...깔끔하지 않은 기분
*/
import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
		int answer = 0;
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int s : scoville) {
			pq.add(s);
		}
		
		while(pq.size()>=2) {
			if(pq.peek()>=K) break;
      int f = pq.poll();
			int s = pq.poll();
			pq.add(f + (s*2));
			answer++;
		}
		return pq.peek()<K?-1:answer;
	}
}
