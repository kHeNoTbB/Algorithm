import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> days = new LinkedList<>();
        for(int i=0; i<progresses.length; i++) {
            int day = (100-progresses[i])/speeds[i];
            if(((100-progresses[i])%speeds[i])!=0) day+=1;
            days.add(day);
        }
        Queue<Integer> ans = new LinkedList<>();
        int day = days.poll();
        int cnt = 1;
        while(!days.isEmpty()) {
            int poll = days.poll();
            if(day>=poll) {
                cnt++;
            } else {
                day = poll;
                ans.add(cnt);
                cnt = 1;
            }
        }
        ans.add(cnt);
        //System.out.println(ans);
        
        int size = ans.size();
        int[] answer = new int[size];
        for(int i=0; i<size; i++) {
            answer[i] = ans.poll();
        }
        return answer;
    }
}
