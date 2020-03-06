import java.util.*;
/*
* HashSet을 사용하면 동명이인을 처리할 수 없기 때문에
* HashMap을 사용하자!
*/
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> hashmap = new HashMap<>();
        for(String par : participant) {
            if(hashmap.containsKey(par)) hashmap.put(par, hashmap.get(par)+1);
            else hashmap.put(par, 1);
        }
        
        for(String com : completion) {
            if(hashmap.containsKey(com)) hashmap.put(com, hashmap.get(com)-1);
        }
        
        for(String str : hashmap.keySet()) {
            if(hashmap.get(str)!=0) answer += str;
        }
        
        return answer;
    }
}
