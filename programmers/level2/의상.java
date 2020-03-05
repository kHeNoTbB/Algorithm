import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        //카테코리, 갯수
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<clothes.length; i++) {            
            //있으면 ++해야되는디..
            if(map.containsKey(clothes[i][1])) {
                map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
            }
                
            //없으면 put하고
            else {
                map.put(clothes[i][1], 1);
            }     
        }
        
        for(String key : map.keySet()){
            //int value = map.get(key);
            //System.out.println(key+" : "+value);
            answer *= (map.get(key)+1);
        }
        
        
        //for (int val : map.values()){
            //System.out.println(answer);   
       // }
        
        return answer-1;
    }
}
