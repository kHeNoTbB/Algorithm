import java.util.*;
    class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> go = new LinkedList<>();
        int[] endtime = new int[truck_weights.length];
        
        //기다리는 버스의 idx를 저장하자
        Queue<Integer> wait = new LinkedList<>();
        for(int i=0; i<truck_weights.length; i++) {
            wait.add(i);
        }
        
        int now_weight = 0;
        while(true) {
            //시간이 지난게 있으면 다리에서 빼야해
            if(!go.isEmpty() && endtime[go.peek()]==answer) {
                now_weight -= truck_weights[go.poll()];
            }
            
            //peek() + 현재 무게 =< weight 인 경우에만 다리 위에 올릴 수 있다.
            if(!wait.isEmpty() && truck_weights[wait.peek()] + now_weight <= weight) {
                //endtime[wait.peek()]++;
                int poll = wait.poll();
                endtime[poll] = answer + bridge_length;
                now_weight += truck_weights[poll];
                go.add(poll);
            }
            
            //전체 시간이 흐른다.
            answer ++;
            if(go.isEmpty() && wait.isEmpty()) break;
        }
        
        return answer;
    }
    }
