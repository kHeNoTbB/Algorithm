import java.util.*;
/*
* scoville의 길이는 1 이상 1,000,000 이하이기 때문에 list를 쓰면 시간초과가 날 수밖에 없다.
* 따라서 priority Queue를 사용하여 문제를 해결했다.
* 또 모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우가 언제가 있을까 생각해봤다.
* 사실 모든 음식이 다 스코빌지수가 0어도 불가능할거같은데 그냥 size가 1일때만 처리해도 통과가 됐다.
*/
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<scoville.length; i++) {
            pq.add(scoville[i]);
        }
        while(true) {
            if(pq.peek()>=K) break;
            if(pq.size()==1)return -1;
            pq.add(pq.poll()+(pq.poll()*2));
            answer++;
        }
        return answer;
    }
}
