import java.util.*;
class Solution {
    /*
    * HashMap을 사용할 줄 아는지 물어보는 문제다
    * (1) hashMap.containsKey(key) : key가 있으면 true, 없으면 false를 리턴한다.
    * (2) hashMap.put(key, value) : key가 있으면 기존 값을 value로 갱신하고, 없으면 추가한다.
    * (3) hashMap을 출력하는 방법을 익혀놓자.
    */
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
